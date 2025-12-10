package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {
	
	@GetMapping("/abc")
	String abc() {
		return "abc";
	}
	
	@GetMapping("/icecream")
	String icecream(Model model) {
		model.addAttribute("flavor", "초코민트");
		return "icecream";
	}
}
