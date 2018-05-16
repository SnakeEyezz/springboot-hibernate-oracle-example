package com.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.starter.entity.Team;
import com.starter.service.TeamService;

@RestController
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(value = "/team", method = RequestMethod.POST,
					consumes = "application/json", produces = "application/json")
	public Team save(@RequestBody Team team){
		
		return teamService.save(team);
	}
	
	@RequestMapping(value = "/team/{teamId}", method = RequestMethod.GET,
			consumes = "application/json", produces = "application/json")
	public Team getTeamById(@PathVariable("teamId") Long teamId){
		
		return teamService.getTeamById(teamId);
	}

}
