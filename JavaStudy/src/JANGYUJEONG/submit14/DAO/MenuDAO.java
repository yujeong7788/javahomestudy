package JANGYUJEONG.submit14.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JANGYUJEONG.submit13.vo.BoardVO;
import JANGYUJEONG.submit14.data.Menu;



public class MenuDAO {
	// 싱글톤 적용
	private MenuDAO() {};
	
	private static MenuDAO instance = new MenuDAO();
	
	public static MenuDAO getInstance() {
		return instance;
	}
	
	
	// 레시피 데이터 삽입 (INSERT) 메소드
	/*
	 * 레시피 번호 rec_no
		레시피 이름 rec_name
		레시피 종류 rec_type
		레시피 재료 rec_ing
		레시피 작성자 rec_author
		레시피 조리법 rec_menual
	 * */
		public int registAll(Connection conn, Menu menu) throws SQLException {
			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO recipe (				");
			query.append("		 rec_no						");
			query.append("		,rec_name					");
			query.append(" 		,rec_type					");
			query.append("	    ,rec_ing					");
			query.append("	    ,rec_author					");
			query.append("	    ,rec_menual					");
			query.append("	) VALUES (						");
			query.append("     (SELECT COUNT(*)+1 FROM recipe)");
			query.append("    ,?							");
			query.append("    ,?							");
			query.append("    ,?							");
			query.append("    ,?							");
			query.append("    ,?							");
			query.append("  )								");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());
			
			int idx = 1;
//			ps.setInt(idx++, board.getBoardNo());
			ps.setString(idx++, menu.getName());
			ps.setString(idx++, menu.getType());
			ps.setString(idx++, menu.getParts());
			ps.setString(idx++, "관리자");
			ps.setString(idx++, menu.getManual());
			
			
			int cnt = ps.executeUpdate();
			
			ps.close();
			
			return cnt;
			
		}
		
		// 레시피 이름 뽑아오는 메소드 ( 수정중@@)
		public String getMenuListName(Connection conn, int no) throws SQLException {
			// 쿼리문 작성
			StringBuffer query = new StringBuffer();
			query.append("SELECT							");
			query.append("		rec_no						");
			query.append(" 		,rec_name					");
			query.append("	    ,rec_type					");
			query.append("	    ,rec_ing					");
			query.append("	    ,rec_author					");
			query.append("	    ,rec_menual					");
			query.append("FROM								");
			query.append("		recipe						");
			query.append("WHERE 1=1 						");
			query.append("	AND rec_no = ? 					");
			
			// 4. 쿼리문을 보유하고 실행할 수 있는 객체 생성 
			PreparedStatement ps = conn.prepareStatement(query.toString()); // 메소드 실행

			int idx = 1;
			ps.setInt(idx++, no);
			
			
			// 5. 쿼리문 실행
			// SELECT문의 경우 executeQuery()
			// SELECT문의 경우 실행결과를 ResultSet에 담는다.
			ResultSet rs = ps.executeQuery();
			
			// 6. ResultSet에 담긴 데이터에 대해
			// StudentVO 객체를 만들어서 리스트에 담아 리턴
			ArrayList<Menu> result = new ArrayList<>();
			
			while(rs.next()) {
				// 쿼리문 실행 결과에 해당하는 컬럼명과 일치해야한다.
				int recNo = rs.getInt("rec_no");
				String name = rs.getString("rec_name");
				String type = rs.getString("rec_type");
				String ingredient = rs.getString("rec_ing");
				String author = rs.getString("rec_author");
				String menual = rs.getString("rec_menual");
				
				Menu menu = new Menu(recNo, name, type, ingredient, menual, author);
				
				result.add(menu);
			}
			
			ps.close();
			rs.close();
			
			return result;
		}
		
		
		// 레시피 데이터 전체 목록 조회
		public ArrayList<Menu> getMenuList(Connection conn) throws SQLException {
			// 쿼리문 작성
			StringBuffer query = new StringBuffer();
			query.append("SELECT							");
			query.append("		rec_no						");
			query.append(" 		,rec_name					");
			query.append("	    ,rec_type					");
			query.append("	    ,rec_ing					");
			query.append("	    ,rec_author					");
			query.append("	    ,rec_menual					");
			query.append("FROM								");
			query.append("		recipe						");
			
			// 4. 쿼리문을 보유하고 실행할 수 있는 객체 생성 
			PreparedStatement ps = conn.prepareStatement(query.toString()); // 메소드 실행
			
			
			// 5. 쿼리문 실행
			// SELECT문의 경우 executeQuery()
			// SELECT문의 경우 실행결과를 ResultSet에 담는다.
			ResultSet rs = ps.executeQuery();
			
			// 6. ResultSet에 담긴 데이터에 대해
			// StudentVO 객체를 만들어서 리스트에 담아 리턴
			ArrayList<Menu> result = new ArrayList<>();
			
			while(rs.next()) {
				// 쿼리문 실행 결과에 해당하는 컬럼명과 일치해야한다.
				int recNo = rs.getInt("rec_no");
				String name = rs.getString("rec_name");
				String type = rs.getString("rec_type");
				String ingredient = rs.getString("rec_ing");
				String author = rs.getString("rec_author");
				String menual = rs.getString("rec_menual");
				
				Menu menu = new Menu(recNo,name, type, ingredient, menual ,author);
				
				result.add(menu);
			}
			
			ps.close();
			rs.close();
			
			return result;
		}
		
		// 레시피 데이터 상세 조회 
		public ArrayList<Menu> getNoMenuList(Connection conn, int no) throws SQLException {
			// 쿼리문 작성
			StringBuffer query = new StringBuffer();
			query.append("SELECT							");
			query.append("		rec_no						");
			query.append(" 		,rec_name					");
			query.append("	    ,rec_type					");
			query.append("	    ,rec_ing					");
			query.append("	    ,rec_author					");
			query.append("	    ,rec_menual					");
			query.append("FROM								");
			query.append("		recipe						");
			query.append("WHERE 1=1 						");
			query.append("	AND rec_no = ? 					");
			
			// 4. 쿼리문을 보유하고 실행할 수 있는 객체 생성 
			PreparedStatement ps = conn.prepareStatement(query.toString()); // 메소드 실행

			int idx = 1;
			ps.setInt(idx++, no);
			
			
			// 5. 쿼리문 실행
			// SELECT문의 경우 executeQuery()
			// SELECT문의 경우 실행결과를 ResultSet에 담는다.
			ResultSet rs = ps.executeQuery();
			
			// 6. ResultSet에 담긴 데이터에 대해
			// StudentVO 객체를 만들어서 리스트에 담아 리턴
			ArrayList<Menu> result = new ArrayList<>();
			
			while(rs.next()) {
				// 쿼리문 실행 결과에 해당하는 컬럼명과 일치해야한다.
				int recNo = rs.getInt("rec_no");
				String name = rs.getString("rec_name");
				String type = rs.getString("rec_type");
				String ingredient = rs.getString("rec_ing");
				String author = rs.getString("rec_author");
				String menual = rs.getString("rec_menual");
				
				Menu menu = new Menu(recNo, name, type, ingredient, menual, author);
				
				result.add(menu);
			}
			
			ps.close();
			rs.close();
			
			return result;
		}

}
