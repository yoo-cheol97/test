package com.ktdsuniversity.edu.board.dao.query;

public class ReplyQuery {
	
	public static String makeInsertReplyQuery() {

		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO BOARD.REPLY													   ");
		query.append(" (ID																		   ");
		query.append(" , BOARD_ID																	   ");
		query.append(" , CONTENT																   ");
		query.append(" , WRITE_DATE)															   ");
		query.append(" VALUES																	   ");
		query.append(" ('RP-' || TO_CHAR(SYSDATE, 'YYYYMMDD-') || LPAD(SEQ_REPLY_PK.NEXTVAL,6,'0') ");
		query.append(" , ?																		   ");
		query.append(" , ?																		   ");
		query.append(" , SYSDATE)																   ");
		
		return query.toString();
		
	}

	public static String makeUpdateReplyQuery() {
	
	StringBuffer query = new StringBuffer();	
		
	query.append(" UPDATE REPLY						");
	query.append(" SET ID = ?  ");
	query.append(" , CONTENT = ?			");
	query.append(" WHERE ID = ?  ");
	
	return query.toString();
	
}
	public static String makeDeleteReplyQuery() {
		StringBuffer query = new StringBuffer();	
		
		query.append(" DELETE	   ");
		query.append(" FROM REPLY   ");
		query.append(" WHERE ID = ?");
		
		return query.toString();
	}
	
	public static String makeSelectAllReplyQuery() {
		StringBuffer query = new StringBuffer();
		query.append("  SELECT LEVEL                                                        ");
		query.append("       , ID                                                           ");
		query.append("       , BOARD_ID                                                     ");
		query.append("       , TOP_ID                                                       ");
		query.append("       , CONTENT                                                      ");
		query.append("       , TO_CHAR(WRITE_DATE, 'YYYY-MM-DD HH24:MI:SS') AS WRITE_DATE   ");
		query.append("    FROM REPLY                                                        ");
		query.append("   WHERE LEVEL > 1                              ");
		query.append("   START WITH ID = ?                                          ");
		query.append(" CONNECT BY PRIOR ID = TOP_ID                                         ");															
		
		return query.toString();
	}
	
	public static String makeSelectOneReplyQuery() {
		StringBuffer query = new StringBuffer();
		query.append("  SELECT ID                                                           ");
		query.append(" , BOARD_ID                                                     ");
		query.append(" , TOP_ID                                                       ");
		query.append(" , CONTENT                                                      ");
		query.append(" , TO_CHAR(WRITE_DATE, 'YYYY-MM-DD HH24:MI:SS') AS WRITE_DATE   ");
		query.append("    FROM REPLY                                                        ");
		query.append("   WHERE ID = ?                              ");															
		
		return query.toString();
	}
	
	public static String makeSelectAllQueryByReplyId() {
		StringBuffer query = new StringBuffer();
		
		query.append("  SELECT LEVEL                                                        ");
		query.append("       , ID                                                           ");
		query.append("       , BOARD_ID                                                     ");
		query.append("       , TOP_ID                                                       ");
		query.append("       , CONTENT                                                      ");
		query.append("       , TO_CHAR(WRITE_DATE, 'YYYY-MM-DD HH24:MI:SS') AS WRITE_DATE   ");
		query.append("    FROM REPLY                                                        ");
		query.append("   WHERE LEVEL > 1                              ");
		query.append("   START WITH ID = ?                                          ");
		query.append(" CONNECT BY PRIOR ID = TOP_ID                                         ");
		
		return query.toString();
	}

}
