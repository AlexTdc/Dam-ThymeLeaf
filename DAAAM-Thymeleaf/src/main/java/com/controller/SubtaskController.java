package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Board;
import com.model.Subtask;
import com.service.BoardService;
import com.service.SubtaskService;

@Controller
@RequestMapping("/subtasks")
public class SubtaskController {
	@Autowired
	private SubtaskService service;
	
@GetMapping("/subtasks")
	public String viewHomePage(Model model) {
	model.addAttribute("listSubtasks",service.getAllSubtasks());
	return "subtask";
}
	
@GetMapping("/subtasks/new_subtask")
public String create(Model model) {
   Subtask s= new Subtask();
    model.addAttribute("subtask",s);
    return "new_subtask";
}
@PostMapping("/subtasks/saveBoard")
public String store(@ModelAttribute("subtask") Subtask s) {
   service.saveSubtask(s);
    return "redirect:/subtasks";
}
}
