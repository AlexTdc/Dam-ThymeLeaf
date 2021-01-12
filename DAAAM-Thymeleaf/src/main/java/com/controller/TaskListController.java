package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Board;
import com.model.TaskList;
import com.service.BoardService;
import com.service.TaskListService;

@Controller
@RequestMapping("/tasklists")
public class TaskListController {
	@Autowired
	private TaskListService taskListservice;
	
@GetMapping
	public String viewHomePage(Model model) {
	model.addAttribute("listTaskLists",taskListservice.getAllTaskLists());
	return "tasklists/index";
}
	
@GetMapping("/new_tasklist")
public String create(Model model) {
    TaskList taskList= new TaskList();
    model.addAttribute("taskList",taskList);
    return "tasklists/new_tasklist";
}
@PostMapping("/saveTaskList")
public String store(@ModelAttribute("tasklist") TaskList t) {
    taskListservice.saveTaskList(t);
    return "redirect:/tasklists";
}
}
