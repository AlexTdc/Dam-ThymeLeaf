package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Board;
import com.model.Team;
import com.service.BoardService;
import com.service.TeamService;

@Controller
@RequestMapping("/teams")
public class TeamController {
	@Autowired
	private TeamService service;
	
@GetMapping("/teams")
	public String viewHomePage(Model model) {
	model.addAttribute("listTeams",service.getAllTeams());
	return "team";
}
	
@GetMapping("/teams/new_team")
public String create(Model model) {
    Team t= new Team();
    model.addAttribute("team", t);
    return "new_team";
}
@PostMapping("/teams/saveTeam")
public String store(@ModelAttribute("team") Team t) {
    service.saveTeam(t);
    return "redirect:/teams";
}
}
