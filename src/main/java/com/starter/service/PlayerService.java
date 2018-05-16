package com.starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starter.entity.Player;
import com.starter.repository.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	public Player save(Player player){
		
		return playerRepository.save(player);
	}

}
