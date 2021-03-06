package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Tournaments {
	
	@Id
	@GeneratedValue
	private int tournamentId;
	private int numOfTeams;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date duration;
	
	
	
	
	public Tournaments() {
		
	}
	
	
	public int getNumOfTeams() {
		return numOfTeams;
	}
	public void setNumOfTeams(int numOfTeams) {
		this.numOfTeams = numOfTeams;
	}
	public int getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Date duration) {
		this.duration = duration;
	}
	

}
