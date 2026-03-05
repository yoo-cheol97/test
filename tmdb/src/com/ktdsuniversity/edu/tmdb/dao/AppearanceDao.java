package com.ktdsuniversity.edu.tmdb.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.tmdb.dao.query.AppearanceQuery;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.db.helper.SQLType;
import com.ktdsuniversity.edu.tmdb.vo.ActorVO;
import com.ktdsuniversity.edu.tmdb.vo.AppearanceVO;

public class AppearanceDao {
	
	private DataAccessHelper dah;
	
	public AppearanceDao(DataAccessHelper dah) {
		this.dah = dah;
		
	}
	
	public List<AppearanceVO> selectAppearanceByMovieId(String movieId){
		List<AppearanceVO> result = new ArrayList<>();
		
		this.dah.preparedStatement(AppearanceQuery.makeSelectQuery(), pstmt ->{
		pstmt.setString(1, movieId);
	});
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			AppearanceVO eachAppearanceVO = new AppearanceVO();
			eachAppearanceVO.setAppearanceId(rs.getString("APPEARANCE_ID"));
			eachAppearanceVO.setActorId(rs.getString("ACTOR_ID"));
			eachAppearanceVO.setMovieId(rs.getString("MOVIE_ID"));
			eachAppearanceVO.setCharacter(rs.getString("CHARACTER"));
			
			ActorVO eachActor = new ActorVO();
			eachActor.setActorId(rs.getString("ACTOR_ID"));
			eachActor.setActorId(rs.getString("ACTOR_NAME"));
			eachActor.setActorId(rs.getString("ACTOR_PROFILE_URL"));
			
			eachAppearanceVO.setActor(eachActor);
			result.add(eachAppearanceVO);
		});
		return result;
		
	}
}
