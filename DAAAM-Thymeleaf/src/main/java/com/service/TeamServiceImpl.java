package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Team;
import com.repository.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	TeamRepository repo;
	@Override
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void saveTeam(Team team) {
		// TODO Auto-generated method stub
		repo.save(team);
		
	}

}
