package com.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.starter.entity.Player;
import com.starter.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping(value = "/player", method = RequestMethod.POST,
			        consumes = "application/json", produces = "application/json")
	public Player save(@RequestBody Player player){
		
		return playerService.save(player);
	}

}
