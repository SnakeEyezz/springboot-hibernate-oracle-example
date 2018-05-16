package com.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starter.entity.Player;
import com.starter.entity.PlayerPK;

@Repository
public interface PlayerRepository extends JpaRepository<Player, PlayerPK>{
	
	

}
