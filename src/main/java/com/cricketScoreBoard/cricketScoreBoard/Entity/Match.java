package com.cricketScoreBoard.cricketScoreBoard.Entity;

import java.sql.Date;

import org.springframework.beans.factory.config.YamlProcessor.MatchStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cricket_match")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

    private String teamHeading;
    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;
    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MathchStatus status;


    private Date date=new Date(id);
    
    public void setMatchStatus() {
        if (this.textComplete.trim().isBlank()) {
            this.status = MathchStatus.LIVE;
        } else {
            this.status = MathchStatus.COMPLETED;
        }
    }

}
