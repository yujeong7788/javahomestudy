package JANGYUJEONG.submit13.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import JANGYUJEONG.submit13.dao.MemDao;
import JANGYUJEONG.submit13.vo.MemVO;
import ch14_jdbc_jsp.context.ConnectionPool;
import ch14_jdbc_jsp.vo.StudentVO;

public class MemService {
	
	private MemService() {}
		
		private static MemService instance = new MemService();
		
		public static MemService getInstance() {
			return instance;
		}
		
		private MemDao dao = MemDao.getInstance();
		private ConnectionPool cp = ConnectionPool.getInstance();
		
		// 회원 조회 (SELECT) 메소드
		public ArrayList<MemVO> getMemList(){
			Connection conn = cp.getConnection();
			ArrayList<MemVO> result = new ArrayList<>();
				try {
					result = dao.getMemList(conn);
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					cp.releaseConnection(conn);
				}
				return result;
		}
		
		// 회원 가입 메소드
		public void registMem(MemVO member) {
			Connection conn = cp.getConnection();
			int cnt = 0;
			try {
				cnt = dao.registMem(conn, member);
				System.out.println("회원가입이 완료되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				cp.releaseConnection(conn);
			}
			
		}
		
		// 로그인 메소드
		public MemVO login(MemVO member) {
			Connection conn = cp.getConnection();
			MemVO result = new MemVO();
			
			try {
				result = dao.login(conn, member);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				cp.releaseConnection(conn);
			}
			
			return result;
		}
		
}
