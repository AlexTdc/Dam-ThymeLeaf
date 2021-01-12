package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.model.Board;
import com.service.BoardService;

@Controller

public class BoardController {
	@Autowired
	private BoardService boardService;
	
@GetMapping("/")
	public String viewHomePage(Model model) {
	model.addAttribute("listBoards",boardService.getAllBoards());
	for(Board b:boardService.getAllBoards()) {
		System.out.println(b.toString());
	}
	return "index";
}
	
@GetMapping("/new_board")
public String create(Model model) {
    Board board = new Board();
    model.addAttribute("board", board);
    return "new_board";
}
@PostMapping("/saveBoard")
public String store(@ModelAttribute("board") Board board) {
    boardService.saveBoard(board);
    return "redirect:/";
}
}
