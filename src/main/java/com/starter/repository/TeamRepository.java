package com.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.starter.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{
	
	@Query("SELECT t FROM Team t WHERE t.teamId = :teamId")
	public Team getTeamById(@Param("teamId") Long teamId);

}
