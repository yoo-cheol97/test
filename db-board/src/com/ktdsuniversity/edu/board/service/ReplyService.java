package com.ktdsuniversity.edu.board.service;

import java.util.List;

import com.ktdsuniversity.edu.board.dao.BoardDao;
import com.ktdsuniversity.edu.board.dao.ReplyDao;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.vo.BoardVO;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

public class ReplyService {
	
	private DataAccessHelper dah;
	private ReplyDao replyDao;
	
	public ReplyService(DataAccessHelper dah) {
		this.dah = dah;
		this.replyDao = new ReplyDao(this.dah);
	}
	
	public void makeDeleteReplyQuery(String Id) {
		try {
			this.replyDao.makeDeleteReplyQuery(Id);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
		
	}
	
	public void modifyReply(ReplyVO modifyReply) {
		try {
			this.replyDao.modifyReply(modifyReply);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
	}
	
	public void createNewArticle2(ReplyVO newArticle) {
		
		try {
			this.replyDao.createNewReply(newArticle);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
		
	}
	
	public ReplyVO readOneReply(String articleId) {
		
		try {
			this.replyDao.readOneReply(articleId);
			ReplyVO result = this.replyDao.readOneReply(articleId);
			this.dah.commit();
			return result;
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
		
		return null;
		
	}
	
	public List<ReplyVO> readAllRepliesByReplyId(String replyId) {
		List<ReplyVO> result = this.replyDao.readAllRepliesByReplyId(replyId);
		return result;
	}

}
