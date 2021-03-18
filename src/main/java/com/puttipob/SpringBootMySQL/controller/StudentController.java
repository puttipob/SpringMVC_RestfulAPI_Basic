package com.puttipob.SpringBootMySQL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.puttipob.SpringBootMySQL.model.Wearer;

@Controller
@RequestMapping("/v1")
public class StudentController {

	@GetMapping("/student")
	public String listStudent(Model model) {
		Wearer wearer = new Wearer();
		wearer.setName("โบ้");
		wearer.setWeight(48.9f);
		model.addAttribute("wearer", wearer);
		model.addAttribute("sname", "boy");
		return "list";
	}

	@PostMapping("/student")
	public String add(@RequestParam("name") String name) {
		System.out.println(name);
		return "success";
	}
}
