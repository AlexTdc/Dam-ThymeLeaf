package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Board;
import com.model.Task;
import com.service.BoardService;
import com.service.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	@Autowired
	private TaskService service;
	
@GetMapping("/tasks")
	public String viewHomePage(Model model) {
	model.addAttribute("listTasks",service.getAllTasks());
	return "tasks";
}
	
@GetMapping("/tasks/new_task")
public String create(Model model) {
    Task t= new Task();
    model.addAttribute("task", t);
    return "new_task";
}
@PostMapping("/tasks/saveTask")
public String store(@ModelAttribute("task") Task t) {
   service.saveTask(t);
    return "redirect:/tasks";
}
}
