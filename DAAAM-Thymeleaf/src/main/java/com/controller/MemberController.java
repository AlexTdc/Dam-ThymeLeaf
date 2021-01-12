package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Board;
import com.model.Member;
import com.service.BoardService;
import com.service.MemberService;

@Controller
@RequestMapping("/members")
public class MemberController {
	@Autowired
	private MemberService service;
	
@GetMapping("/members")
	public String viewHomePage(Model model) {
	model.addAttribute("listMembers",service.getAllMembers());
	return "member";
}
	
@GetMapping("/members/new_member")
public String create(Model model) {
   Member member= new Member();
    model.addAttribute("member", member);
    return "new_member";
}
@PostMapping("/members/saveMember")
public String store(@ModelAttribute("member") Member member) {
    service.saveMember(member);
    return "redirect:/members";
}
}
