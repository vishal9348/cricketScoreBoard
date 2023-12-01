package com.cricketScoreBoard.cricketScoreBoard.Service;

import java.util.List;
import java.util.Map;
import com.cricketScoreBoard.cricketScoreBoard.Entity.Match;

public interface MatchService {

	List<Match> getAllMatches();
	
	List<Match> getLiveMatches();
	
	List<List<String>> getPointTable();
}
