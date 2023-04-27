package JANGYUJEONG.submit13.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import JANGYUJEONG.submit13.dao.BoardDao;
import JANGYUJEONG.submit13.vo.BoardVO;
import JANGYUJEONG.submit13.vo.MemVO;
import ch14_jdbc_jsp.context.ConnectionPool;
import ch14_jdbc_jsp.vo.StudentVO;

public class BoardService {
	
	private BoardService() {}
	
	private static BoardService instance = new BoardService();
	
	public static BoardService getInstance() {
		return instance;
	}
	
	private BoardDao dao = BoardDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	

	// 게시글 조회 메소드
	public ArrayList<BoardVO> getBoardList(int no){
		Connection conn = cp.getConnection();
		ArrayList<BoardVO> result = new ArrayList<>();
			try {
				result = dao.getBoardList(conn,no);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				cp.releaseConnection(conn);
			}
			return result;
	}
	
	// 게시글 입력 메소드
	public void registBoard(BoardVO board) {
		Connection conn = cp.getConnection();
		int cnt = 0;
		try {
			cnt = dao.registBoard(conn, board);
			System.out.println("글이 작성되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
	}
	

}
