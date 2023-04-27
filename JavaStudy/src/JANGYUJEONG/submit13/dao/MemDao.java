package JANGYUJEONG.submit13.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JANGYUJEONG.submit13.vo.MemVO;
import ch14_jdbc_jsp.vo.StudentVO;

public class MemDao {
	
	// 싱글톤 적용
	private MemDao() {};
	
	private static MemDao instance = new MemDao();
	
	public static MemDao getInstance() {
		return instance;
	}

	// 회원 조회 (SELECT) 메소드
	public ArrayList<MemVO> getMemList(Connection conn) throws SQLException {
		// 쿼리문 작성
		StringBuffer query = new StringBuffer();
		query.append("SELECT					");
		query.append("		mem_id				");
		query.append(" 		,mem_pw				");
		query.append("	    ,mem_name			");
		query.append("FROM						");
		query.append("		member				");
		
		// 4. 쿼리문을 보유하고 실행할 수 있는 객체 생성 
		PreparedStatement ps = conn.prepareStatement(query.toString()); // 메소드 실행
		
		// 5. 쿼리문 실행
		// SELECT문의 경우 executeQuery()
		// SELECT문의 경우 실행결과를 ResultSet에 담는다.
		ResultSet rs = ps.executeQuery();
		
		// 6. ResultSet에 담긴 데이터에 대해
		// StudentVO 객체를 만들어서 리스트에 담아 리턴
		ArrayList<MemVO> result = new ArrayList<>();
		
		while(rs.next()) {
			// 쿼리문 실행 결과에 해당하는 컬럼명과 일치해야한다.
			String memId = rs.getString("mem_id");
			String memPw = rs.getString("mem_pw"); // 컬럼명 똑같게!! 잘 적기
			String memName = rs.getString("mem_name");

			
			MemVO mem = new MemVO(memId, memPw, memName);
			
			result.add(mem);
		}
		
		ps.close();
		rs.close();
		
		return result;
	}
	
	
	// 회원가입(INSERT) 메소드
	public int registMem(Connection conn, MemVO member) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO member (			");
		query.append("		mem_id					");
		query.append(" 		,mem_pw					");
		query.append("	    ,mem_name				");
		query.append("	) VALUES (					");
		query.append("     ?						");
		query.append("    ,?						");
		query.append("    ,?						");
		query.append("  )							");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, member.getMemId());
		ps.setString(idx++, member.getMemPassword());
		ps.setString(idx++, member.getMemName());
		
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
		
	}
	
	// 로그인(SELECT) 메소드
	// 입력받은 아이디와 비밀번호가 일치하는 하나의 데이터 리턴
	public MemVO login(Connection conn,MemVO member) throws SQLException {
		
		StringBuffer query = new StringBuffer();
		query.append("SELECT				");
		query.append("		mem_id			");
		query.append(" 	   ,mem_pw  		");
		query.append("	   ,mem_name		");
		query.append("FROM					");
		query.append("		member			");
		query.append("WHERE 1=1 			");
		query.append("	AND mem_id = ? 		");
		query.append("	AND mem_pw = ?		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, member.getMemId());
		ps.setString(idx++, member.getMemPassword());
		
		ResultSet rs = ps.executeQuery();
		
		MemVO result = new MemVO();
		
		while(rs.next()) {
			result.setMemId(rs.getString("mem_id"));
			result.setMemPassword(rs.getString("mem_pw"));
			result.setMemName(rs.getString("mem_name"));
		}
		
		rs.close();
		ps.close();
		
		return result;
		
	}
	
	// 아이디 중복 체크(SELECT) 메소드
	
}
