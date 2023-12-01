package com.cricketScoreBoard.cricketScoreBoard.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricketScoreBoard.cricketScoreBoard.Entity.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{

	Optional<Match> findByTeamHeading(String teamHeading);
}
