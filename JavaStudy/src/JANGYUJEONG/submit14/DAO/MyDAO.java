package JANGYUJEONG.submit14.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JANGYUJEONG.submit13.dao.BoardDao;
import JANGYUJEONG.submit13.service.MemService;
import JANGYUJEONG.submit13.vo.BoardVO;
import JANGYUJEONG.submit14.Service.MenuService;
import JANGYUJEONG.submit14.VO.MyVO;

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
		
		
	// 즐겨찾기 조회 이너 조인 메소드
		

}
