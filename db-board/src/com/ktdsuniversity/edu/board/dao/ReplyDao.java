package com.ktdsuniversity.edu.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.board.dao.query.BoardQuery;
import com.ktdsuniversity.edu.board.dao.query.ReplyQuery;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.db.helper.SQLType;
import com.ktdsuniversity.edu.board.vo.BoardVO;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

public class ReplyDao {
	
	private DataAccessHelper dah;
	
	public ReplyDao(DataAccessHelper dah) {
		this.dah = dah;
	}

	// List<ReplyVO> 댓글 목록 조회(게시글 아이디)
	// 게시글에 등록된 모든 댓글 조회 (대댓글 포함) - 계층 조회
	public List<ReplyVO> readAllReplies(String articleId) {

		List<ReplyVO> result = new ArrayList<>();

		this.dah.executeQuery(SQLType.SELECT, rs -> {
			ReplyVO eachReply = new ReplyVO();

			eachReply.setId(rs.getString("ID"));
			eachReply.setBoardId(rs.getString("BOARD_ID"));
			eachReply.setTopId(rs.getString("TOP_ID"));
			eachReply.setContent(rs.getString("CONTENT"));
			eachReply.setWriteDate(rs.getString("WRITE_DATE"));

			result.add(eachReply);
		});
		this.dah.commit();
		return result;
	}

	
	// ReplyVO 댓글 조회(댓글 아이디)
	
	public ReplyVO readOneReply(String articleId) {
		
		// UPDATE => 조회수를 1증가
	
	
		ReplyVO result = new ReplyVO();
		
		this.dah.preparedStatement(ReplyQuery.makeSelectOneReplyQuery(), (pstmt ->{
			pstmt.setString(1, articleId);
		}));
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			result.setId(rs.getString("ID"));
			result.setBoardId(rs.getString("BOARD_ID"));
			result.setContent(rs.getString("CONTENT"));
			
			
		});
		
		this.dah.commit();
		return result;
	}

	
	
	


	
	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	// 댓글에 등록된 모든 대댓글 조회 (대댓글 포함) - 계층 조회
	
	public List<ReplyVO> readAllRepliesByReplyId(String replyId) {

		List<ReplyVO> result = new ArrayList<>();

		dah.executeQuery(SQLType.SELECT, rs -> {
			ReplyVO eachReply = new ReplyVO();

			eachReply.setId(rs.getString("ID"));
			eachReply.setBoardId(rs.getString("BOARD_ID"));
			eachReply.setTopId(rs.getString("TOP_ID"));
			eachReply.setContent(rs.getString("CONTENT"));
			eachReply.setWriteDate(rs.getString("WRITE_DATE"));

			result.add(eachReply);
		});
		dah.commit();

		return result;

	}
	
	// void 댓글 등록(ReplyVO)
	public void createNewReply(ReplyVO replyVO) {

		this.dah.preparedStatement(ReplyQuery.makeInsertReplyQuery(), pstmt -> {
			pstmt.setString(1, replyVO.getBoardId());
			pstmt.setString(2, replyVO.getTopId());
			pstmt.setString(2, replyVO.getContent());
		});

		this.dah.executeQuery(SQLType.INSERT, null);
	}
	

	// void 댓글 수정(ReplyVO)
	
	public void modifyReply(ReplyVO modifyReply) {
		

		this.dah.preparedStatement(ReplyQuery.makeUpdateReplyQuery(), (pstmt ->{
			pstmt.setString(1, modifyReply.getId());
			pstmt.setString(2, modifyReply.getContent());
			pstmt.setString(3, modifyReply.getId());
		}));
		this.dah.executeQuery(SQLType.UPDATE, null);
			
	}
		
		

	
	// void 댓글 삭제(댓글 아이디)
	
	public void makeDeleteReplyQuery(String Id) {
		
		this.dah.preparedStatement(ReplyQuery.makeDeleteReplyQuery(), (pstmt ->{
			pstmt.setString(1, Id);
		}));
		this.dah.executeQuery(SQLType.DELETE, null);
		
		
		
	}


}
