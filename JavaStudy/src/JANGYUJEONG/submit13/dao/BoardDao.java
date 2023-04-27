package JANGYUJEONG.submit13.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JANGYUJEONG.submit13.vo.BoardVO;
import JANGYUJEONG.submit13.vo.MemVO;
import ch14_jdbc_jsp.vo.StudentVO;

public class BoardDao {
	
	// 싱글톤 적용
	private BoardDao() {};
	
	private static BoardDao instance = new BoardDao();
	
	public static BoardDao getInstance() {
		return instance;
	}
	
	// 게시글 조회 (SELECT) 메소드
	public ArrayList<BoardVO> getBoardList(Connection conn, int no) throws SQLException {
		// 쿼리문 작성
		StringBuffer query = new StringBuffer();
		query.append("SELECT							");
		query.append("		board_no					");
		query.append(" 		,board_title				");
		query.append("	    ,board_content				");
		query.append("	    ,board_author				");
		query.append("	    ,board_date					");
		query.append("FROM								");
		query.append("		board						");
		query.append("WHERE 1=1 						");
		query.append("	AND board_no = ? 				");
		
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
		ArrayList<BoardVO> result = new ArrayList<>();
		
		while(rs.next()) {
			// 쿼리문 실행 결과에 해당하는 컬럼명과 일치해야한다.
			int boardNo = rs.getInt("board_no");
			String boardTitle = rs.getString("board_title");
			String boardContent = rs.getString("board_content");
			String boardAuthor = rs.getString("board_author");
			String boardDate = rs.getString("board_date");


			
			BoardVO board = new BoardVO(boardNo, boardTitle, boardContent, boardAuthor, boardDate);
			
			result.add(board);
		}
		
		ps.close();
		rs.close();
		
		return result;
	}
	
	// 게시글 작성(INSERT) 메소드
	public int registBoard(Connection conn, BoardVO board) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO board (				");
		query.append("		 board_no					");
		query.append(" 		,board_title				");
		query.append("	    ,board_content				");
		query.append("	    ,board_author				");
		query.append("	    ,board_date					");
		query.append("	) VALUES (						");
		query.append("     (SELECT COUNT(*)+1 FROM board)");
		query.append("    ,?							");
		query.append("    ,?							");
		query.append("    ,?							");
		query.append("    ,SYSDATE						");
		query.append("  )								");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
//		ps.setInt(idx++, board.getBoardNo());
		ps.setString(idx++, board.getBoardTitle());
		ps.setString(idx++, board.getBoardContent());
		ps.setString(idx++, board.getBoardAuthor());
//		ps.setString(idx++, board.getBoardDate());
		
		
		int cnt = ps.executeUpdate();
		
		ps.close();
		
		return cnt;
		
	}
}
