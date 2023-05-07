package JANGYUJEONG.submit14.Service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JANGYUJEONG.submit13.vo.BoardVO;
import JANGYUJEONG.submit14.DAO.MenuDAO;
import JANGYUJEONG.submit14.data.Menu;
import ch14_jdbc_jsp.context.ConnectionPool;

public class MenuService {
	
	private MenuService() {}
	
	private static MenuService instance = new MenuService();
	
	public static MenuService getInstance() {
		return instance;
	}
	
	private MenuDAO dao = MenuDAO.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	// 레시피 데이터 삽입 (INSERT) 메소드
	public void registAll(Menu menu) {
			Connection conn = cp.getConnection();
			int cnt = 0;
			try {
				cnt = dao.registAll(conn, menu);
				System.out.println("데이터 삽입 성공");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				cp.releaseConnection(conn);
			}
		}
	
	// 레시피 데이터 전체 조회 (SELECT) 메소드
	public ArrayList<Menu> getMenuList(){
		Connection conn = cp.getConnection();
		ArrayList<Menu> result = new ArrayList<>();
			try {
				result = dao.getMenuList(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				cp.releaseConnection(conn);
			}
			return result;
	}
	
	// 레시피 데이터 상세 조회 (SELECT) 메소드
	public ArrayList<Menu> getNoMenuList(int no){
		Connection conn = cp.getConnection();
		ArrayList<Menu> result = new ArrayList<>();
			try {
				result = dao.getNoMenuList(conn,no);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				cp.releaseConnection(conn);
			}
			return result;
	}
	
	// 레시피 이름 뽑아오는 메소드
			public ArrayList<Menu> getMenuListName(int no){
				Connection conn = cp.getConnection();
				ArrayList<Menu> result = new ArrayList<>();
					try {
						result = dao.getMenuListName(conn,no);
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						cp.releaseConnection(conn);
					}
					return result;
			}
	

}
