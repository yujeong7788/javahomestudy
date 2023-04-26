package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelect {

	public static void main(String[] args) {
		
		// 1. 드라이버 로딩 (가장 오래걸림)
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
			// 2. 커넥션 객체 생성 (두번째 오래걸림)
			// 오라클 DB와 접속이 된 객체를 리턴
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB 커넥션 성공");
			
			// 3. 쿼리문 작성
			StringBuffer query = new StringBuffer(); // 빈문자열
			// 문자열 하나에 다 넣는 것 보다 수정 삭제 용이
			query.append("SELECT				");
			query.append("		stu_id		");
			query.append(" ,stu_password  AS pw	"); // 알리아스 줄 때 알리아스명으로 적어야함
			query.append("	   ,stu_name	");
			query.append("	   ,stu_score	");
			query.append("FROM				");
			query.append("		students	"); // 세미콜론이 없음에 주의
			
			// 4. 쿼리문을 보유하고 실행할 수 있는 객체 생성
			ps = conn.prepareStatement(query.toString()); // 메소드 실행
			
			// 5. 쿼리문 실행
			// SELECT문의 경우 executeQuery()
			// SELECT문의 경우 실행결과를 ResultSet에 담는다.
			rs = ps.executeQuery();
			
			// 6. ResultSet에 담긴 데이터 조회
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
			
			// 연결 종료 ( 에러시 catch로 가서 close 안될 수 도)
			// 여기서하면
			
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
