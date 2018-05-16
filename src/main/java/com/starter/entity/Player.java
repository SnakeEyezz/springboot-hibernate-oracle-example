package com.starter.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PLAYER")
public class Player implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PlayerPK playerPK;
	
	@Column(name = "PLAYER_NAME")
	private String playerName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teamId", insertable = false, updatable = false)
	private Team team;

	public PlayerPK getPlayerPK() {
		return playerPK;
	}

	public void setPlayerPK(PlayerPK playerPK) {
		this.playerPK = playerPK;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	@JsonIgnore
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}