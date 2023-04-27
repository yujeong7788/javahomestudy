package ch14_jdbc_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.vo.StudentVO;

public class StudentDAO {
	
	private StudentDAO() {};
	
	private static StudentDAO instance = new StudentDAO();
	
	public static StudentDAO getInstance() {
		return instance;
	}
	
	// 학생 조회 (SELECT) 메소드
	public ArrayList<StudentVO> getStuList(Connection conn) throws SQLException{
		// 쿼리문 작성
		StringBuffer query = new StringBuffer();
		query.append("SELECT					");
		query.append("		stu_id				");
		query.append(" ,stu_password  AS pw		");
		query.append("	   ,stu_name			");
		query.append("	   ,stu_score			");
		query.append("FROM						");
		query.append("		students			");
		query.append("ORDER BY stu_score DESC	");
		
		// 4. 쿼리문을 보유하고 실행할 수 있는 객체 생성 // 스로우?
		PreparedStatement ps = conn.prepareStatement(query.toString()); // 메소드 실행
		
		// 5. 쿼리문 실행
		// SELECT문의 경우 executeQuery()
		// SELECT문의 경우 실행결과를 ResultSet에 담는다.
		ResultSet rs = ps.executeQuery();
		
		// 6. ResultSet에 담긴 데이터에 대해
		// StudentVO 객체를 만들어서 리스트에 담아 리턴
		ArrayList<StudentVO> result = new ArrayList<>();
		
		while(rs.next()) {
			// 쿼리문 실행 결과에 해당하는 컬럼명과 일치해야한다.
			String stuId = rs.getString("stu_id");
			String stuPw = rs.getString("pw"); // 컬럼명 똑같게!! 잘 적기
			String stuName = rs.getString("stu_name");
			int stuScore = rs.getInt("stu_score");
			
			// 둘 중 하나 택
			// 1
			StudentVO stu = new StudentVO(stuId, stuPw, stuName, stuScore);
			
			result.add(stu);
//			// 2
//			StudentVO temp = new StudentVO();
//			temp.setStuId(rs.getString("stu_id"));
//			temp.setStuPassword(rs.getString("pw"));
//			temp.setStuName(rs.getString("stu_name"));
//			temp.setStuScore(rs.getInt("stu_score"));
		}
		
		ps.close();
		rs.close();
		
		return result;
	}
	
	// 학생 회원가입(INSERT) 메소드
	public int registStudent(Connection conn, String id, String pw, String name) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO students (		");
		query.append("     stu_id					");
		query.append("    ,stu_password				");
		query.append("    ,stu_name					");
		query.append("    ,stu_score				");
		query.append("	) VALUES (					");
		query.append("     ?						");
		query.append("    ,?						");
		query.append("    ,?						");
		query.append("    ,?						");
		query.append("  )							");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, id);
		ps.setString(idx++, pw);
		ps.setString(idx++, name);
		ps.setInt(idx++, 0);
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
		
	}
	
	// 학생 회원가입(INSERT) 메소드2
		public int registStudent(Connection conn, StudentVO student) throws SQLException{
			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO students (		");
			query.append("     stu_id					");
			query.append("    ,stu_password				");
			query.append("    ,stu_name					");
			query.append("    ,stu_score				");
			query.append("	) VALUES (					");
			query.append("     ?						");
			query.append("    ,?						");
			query.append("    ,?						");
			query.append("    ,0						");
			query.append("  )							");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());
			
			int idx = 1;
			ps.setString(idx++, student.getStuId());
			ps.setString(idx++, student.getStuPassword());
			ps.setString(idx++, student.getStuName());
			
			
			int cnt = ps.executeUpdate();
			
			ps.close();
			
			return cnt;
			
		}
	
	// 로그인(SELECT) 메소드
	// 입력받은 아이디와 비밀번호가 일치하는 하나의 데이터 리턴
	public StudentVO login(Connection conn,StudentVO student) throws SQLException {
		
		StringBuffer query = new StringBuffer();
		query.append("SELECT				");
		query.append("		stu_id			");
		query.append(" ,stu_password  AS pw	");
		query.append("	   ,stu_name		");
		query.append("	   ,stu_score		");
		query.append("FROM					");
		query.append("		students		");
		query.append("WHERE 1=1 			");
		query.append("	AND stu_id = ? 		");
		query.append("	AND stu_password = ?");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, student.getStuId());
		ps.setString(idx++, student.getStuPassword());
		
		ResultSet rs = ps.executeQuery();
		
		StudentVO result = new StudentVO();
		
		while(rs.next()) {
			result.setStuId(rs.getString("stu_id"));
			result.setStuPassword(rs.getString("pw"));
			result.setStuName(rs.getString("stu_name"));
			result.setStuScore(rs.getInt("stu_score"));
		}
		
		rs.close();
		ps.close();
		
		return result;
		
	}
	
	// 학생의 점수 증가(UPDATE) 메소드
	public int plusScore(Connection conn, String stuId) throws SQLException {
		
		// 업데이트 쿼리문
		StringBuffer query = new StringBuffer();
		query.append("UPDATE  						");
		query.append("		students 				");
		query.append("SET    						");
		query.append("    stu_score	= stu_score + 1	");
		query.append("WHERE 1=1						"); 
		query.append("  AND stu_id = ?				");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ps.setString(1, stuId);
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
	}

}
