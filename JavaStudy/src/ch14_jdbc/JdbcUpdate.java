package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUpdate {

	public static void main(String[] args) {
	// 1. 드라이버 로딩
		// (프로젝트 내에서 단 한번만 실행이 되면 됨)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 실패");
			System.exit(0); // 현재 프로그램 종료
		}
		
		String url = "jdbc:oracle:thin:@192.168.1.16:1521:xe"; //@ip : 캡처화면 참고 
		String id = "jdbc";
		String pw = "oracle";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		
		try {
			conn = DriverManager.getConnection(url,id,pw);
			
			StringBuffer query = new StringBuffer();
			query.append("UPDATE  						");
			query.append("		students 				");
			query.append("SET    						");
			query.append("    stu_score	= stu_score + 1	");
			query.append("WHERE 1=1						"); // and로 연결하기위해 
			query.append("  AND stu_id = ?				");
			
			// 값에 대해 ?로 표기한 후 다음 단계에서
			// ? 에 값을 채워주어도 된다.
			ps = conn.prepareStatement(query.toString());
			
			// 위에서부터 ? 를 채워나가며,
			// 위에서부터 ? 의 인덱스는 1부터 증가한다.
			int idx = 1;
			ps.setString(idx++, "d001");
			
			// 쿼리문 실행
			// Isert,delete,update문은
			//ps.exeuteUpdate()로 실행
			
			// cnt에는 n행이 삽입되었습니다.의 n이 저장된다.
			int cnt = ps.executeUpdate();
			
			System.out.println(cnt +"행 이(가) 수정되었습니다.");
			
			// 업데이트문 실행 후 SELECT문 실행하여
			// 변경사항 확인
			query = new StringBuffer(); 
			query.append("SELECT				");
			query.append("		stu_id		");
			query.append(" ,stu_password  AS pw	"); 
			query.append("	   ,stu_name	");
			query.append("	   ,stu_score	");
			query.append("FROM				");
			query.append("		students	"); 
			
			// 사용했던 ps는 한번 닫아준 뒤 사용
			ps.close();
			ps = conn.prepareStatement(query.toString());
			
			rs = ps.executeQuery();
			
			// ResultSet에 담긴 데이터 조회
			while(rs.next()) {
				// 쿼리문 실행 결과에 해당하는 컬럼명과 일치해야한다.
				String stuId = rs.getString("stu_id");
				String stuPw = rs.getString("pw"); // 컬럼명 똑같게!! 잘 적기
				String stuName = rs.getString("stu_name");
				int stuScore = rs.getInt("stu_score");
				
				System.out.print(" 아이디: " + stuId);
				System.out.print(" 비밀번호: " + stuPw);
				System.out.print(" 이름: " + stuName);
				System.out.println(" 점수: " + stuScore);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 7. 자원 정리 에러나서 널값일때 close할까봐 if 조건으로 
			if(rs != null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(ps != null)try {ps.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn != null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
	}

}
