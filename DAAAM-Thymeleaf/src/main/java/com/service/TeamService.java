package com.service;

import java.util.List;

import com.model.Team;

public interface TeamService {
	List<Team>getAllTeams();
	void saveTeam(Team team);
}
