package JANGYUJEONG.submit14.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import JANGYUJEONG.submit14.DAO.MyDAO;
import JANGYUJEONG.submit14.VO.JoinVO;
import JANGYUJEONG.submit14.VO.MyVO;
import JANGYUJEONG.submit14.data.Menu;
import ch14_jdbc_jsp.context.ConnectionPool;
import ch14_jdbc_jsp.dao.StudentDAO;

public class MyService {
	
	// 싱글톤 적용
	private MyService() {};
	
	private static MyService instance = new MyService();
	
	public static MyService getInstance() {
		return instance;
	}
	
	private MyDAO dao = MyDAO.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	// 즐겨찾기 등록 메소드
	public void registMy(MyVO my) throws SQLException {
		Connection conn = cp.getConnection();
		int cnt = 0;
		try {
			cnt = dao.registMy(conn, my);
			System.out.println("레시피가 즐겨찾기에 추가 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
	}
	
	// 즐겨찾기에 등록한 레시피 조회 (조인)
	public ArrayList<JoinVO> starMenuList(String memId){
		Connection conn = cp.getConnection();
		ArrayList<JoinVO> result = new ArrayList<>();
			try {
				result = dao.starMenuList(conn,memId);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				cp.releaseConnection(conn);
			}
			return result;
	}
	
	// 즐겨찾기에 등록된 레시피 삭제
	public void deleteMy(MyVO my) {
		Connection conn = cp.getConnection();
		int cnt = 0;
		try {
			cnt = dao.deleteMy(conn, my);
			System.out.println("레시피가 즐겨찾기에서 삭제 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
	}

}
