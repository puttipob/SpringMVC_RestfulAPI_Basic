package com.puttipob.SpringBootMySQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puttipob.SpringBootMySQL.model.Wearer;
import com.puttipob.SpringBootMySQL.model.WearerRepository;

@RestController
public class HelloController {

	@Autowired
	WearerRepository repo;

	@GetMapping("/hello")
	public String sayHello() {
		List<Wearer> wearerList = repo.findAll();
		for (Wearer w : wearerList) {
			System.out.println(w.getName());
		}
		return "สวัสดีย์ ฉันมาจากอนาคต";
	}
}
