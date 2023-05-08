package JANGYUJEONG.submit14.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JANGYUJEONG.submit13.dao.BoardDao;
import JANGYUJEONG.submit13.service.MemService;
import JANGYUJEONG.submit13.vo.BoardVO;
import JANGYUJEONG.submit14.Service.MenuService;
import JANGYUJEONG.submit14.VO.JoinVO;
import JANGYUJEONG.submit14.VO.MyVO;
import JANGYUJEONG.submit14.data.Menu;

public class MyDAO {
	// 싱글톤 적용
		private MyDAO() {};
		
		private static MyDAO instance = new MyDAO();
		
		public static MyDAO getInstance() {
			return instance;
		}
		
	
	// 즐겨찾기 등록 메소드
		public int registMy(Connection conn, MyVO my) throws SQLException {
			
			MemService memService = MemService.getInstance();
			MenuService menuService = MenuService.getInstance();
			
			
			
			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO star (				");
			query.append("		 star_no					");
			query.append(" 		,mem_id						");
			query.append("	    ,rec_name					");
			query.append("	) VALUES (						");
			query.append("     (SELECT COUNT(*)+1 FROM star)");
			query.append("    ,?							");
			query.append("    ,?							");
			query.append("  )								");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());
			
			int idx = 1;
//			ps.setInt(idx++, board.getBoardNo());
			ps.setString(idx++, my.getMemId());
			ps.setString(idx++, my.getRecName());
//			ps.setString(idx++, board.getBoardDate());
			
			
			int cnt = ps.executeUpdate();
			
			ps.close();
			
			return cnt;
			
		}
		
		
	// 즐겨찾기 조회 조인 메소드
	public ArrayList<JoinVO> starMenuList(Connection conn,String memId) throws SQLException {
		// 쿼리문 작성
		StringBuffer query = new StringBuffer();
		query.append("SELECT							   ");
		query.append("		c.rec_name					");
		query.append(" 		,rec_no						");
		query.append("	    ,rec_type				    	");
		query.append("	    ,rec_ing				    	");
		query.append("	    ,rec_author					");
		query.append("	    ,rec_menual					");
		query.append("	    ,a.mem_id				    	");
		query.append("FROM							    	");
		query.append("		member a				     	");
		query.append("		,star b						");
		query.append("		,recipe5 c					");
		query.append("WHERE 1=1 					     	");
		query.append("	AND a.mem_id = b.mem_id 		");
		query.append("	AND b.rec_name = c.rec_name 	");
		query.append("	AND a.mem_id = ? 				");
		
		// 4. 쿼리문을 보유하고 실행할 수 있는 객체 생성 
		PreparedStatement ps = conn.prepareStatement(query.toString()); // 메소드 실행

		int idx = 1;
		ps.setString(idx++,memId);
		
		
		// 5. 쿼리문 실행
		// SELECT문의 경우 executeQuery()
		// SELECT문의 경우 실행결과를 ResultSet에 담는다.
		ResultSet rs = ps.executeQuery();
		
		// 6. ResultSet에 담긴 데이터에 대해
		// StudentVO 객체를 만들어서 리스트에 담아 리턴
		ArrayList<JoinVO> result = new ArrayList<>();
		
		while(rs.next()) {
			// 쿼리문 실행 결과에 해당하는 컬럼명과 일치해야한다.
			int recNo = rs.getInt("rec_no");
			String name = rs.getString("rec_name");
			String type = rs.getString("rec_type");
			String ingredient = rs.getString("rec_ing");
			String author = rs.getString("rec_author");
			String menual = rs.getString("rec_menual");
			String id = rs.getString("mem_id");
			
			JoinVO join = new JoinVO(recNo, name, ingredient, menual, author, type, id);
			
			result.add(join);
		}
		
		ps.close();
		rs.close();
		
		return result;
	}
	
	
	// 즐겨찾기 삭제 메소드
	public int deleteMy(Connection conn, MyVO my) throws SQLException {
		
		MemService memService = MemService.getInstance();
		MenuService menuService = MenuService.getInstance();
		
		
		
		StringBuffer query = new StringBuffer();
		query.append("DELETE 							");
		query.append("	     star						");
		query.append("WHERE 1=1							");
		query.append("  AND mem_id = ?					");
		query.append("  AND rec_name = ?					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, my.getMemId());
		ps.setString(idx++, my.getRecName());
		
		
		int cnt = ps.executeUpdate();
		conn.commit();
		ps.close();
		
		return cnt;
		
	}
	
		

}
