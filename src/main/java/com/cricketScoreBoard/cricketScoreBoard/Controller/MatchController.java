package com.cricketScoreBoard.cricketScoreBoard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketScoreBoard.cricketScoreBoard.Entity.Match;
import com.cricketScoreBoard.cricketScoreBoard.Service.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
	
	@Autowired
	private MatchService matchService;

	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatch(){
		
		return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches(){
		
		return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
	}
	
	@GetMapping("/point-table")
	public ResponseEntity<?> getPointTable(){
		
		return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
	}
}
