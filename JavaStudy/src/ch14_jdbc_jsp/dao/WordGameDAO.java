package ch14_jdbc_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.vo.wordgameVO;

public class WordGameDAO {
	
	private WordGameDAO() {}
	
	private static WordGameDAO instance = new WordGameDAO();
	
	public static WordGameDAO getInstance() {
		return instance;
	}

	// 단어 목록(SELECT) 가져오기
	public ArrayList<wordgameVO> getWordList(Connection conn) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("SELECT				");
		query.append(" 		words			");
		query.append("FROM      			");
		query.append("		wordgame		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ResultSet rs = ps.executeQuery(); //SELECT문은 executeQuery , 쿼리 실행결과 ResultSet에 담아줌
		ArrayList<wordgameVO> result = new ArrayList<>();
		
		while(rs.next()) {
			wordgameVO temp = new wordgameVO();
			temp.setWords(rs.getString("words"));
			result.add(temp);
		}
		rs.close();
		ps.close();
		
		return result;
	}

}
