package com.starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starter.entity.Player;
import com.starter.entity.Team;
import com.starter.repository.TeamRepository;

@Service
public class TeamService {
	
	@Autowired
	private TeamRepository teamRepository;
	
	public Team save(Team team){
		
		//saving only team table data
		Team team1 = new Team();
		team1.setTeamName(team.getTeamName());
		team1 = teamRepository.save(team1);
		team.setTeamId(team1.getTeamId());
		
		//saving data into all tables associated with team table
		for(Player player : team.getPlayerList())
			player.getPlayerPK().setTeamId(team.getTeamId());
		
		return teamRepository.save(team);
	}
	
	public Team getTeamById(Long teamId){
		
		return teamRepository.getTeamById(teamId);
	}

}
