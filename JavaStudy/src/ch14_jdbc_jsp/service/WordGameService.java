package ch14_jdbc_jsp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import ch14_jdbc_jsp.dao.WordGameDAO;
import ch14_jdbc_jsp.vo.wordgameVO;

public class WordGameService {
	
	private WordGameService() {}
	
	private static WordGameService instance = new WordGameService();
	
	public static WordGameService getInstance() {
		return instance;
	}
	
	private WordGameDAO dao = WordGameDAO.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	
	public ArrayList<wordgameVO> getWordList(){
		Connection conn = cp.getConnection();
		ArrayList<wordgameVO> result = new ArrayList<>();
		
		try {
			return dao.getWordList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
		return result;
	}

}
