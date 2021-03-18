package com.puttipob.SpringBootMySQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.puttipob.SpringBootMySQL.model.Forum;
import com.puttipob.SpringBootMySQL.model.ForumRepository;

@Controller
public class ForumController {
	@Autowired
	private ForumRepository repo;

	@GetMapping("/forum")
	public String test(Model model) {
		List<Forum> list = repo.findAll();
		model.addAttribute("list", list);
		return "forum";
	}
}
