package com.practise.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model m) {

		m.addAttribute("name", "My name is Gourav");
		m.addAttribute("date", new Date().toString());

		return "about";
	}

	// Handling iteration(Loops)
	@GetMapping("/ex-loop")
	public String home(Model m) {
		// create a list , set collection

		List<String> names = List.of("gourav", "neeru", "rajni", "srishti");
		m.addAttribute("names", names);

		return "iterate";
	}

	// Conditional based rendering ((if/else,switch))

	@GetMapping("/ex-con")
	public String conditionHandler(Model m) {

		// Elvis Operator
		m.addAttribute("isActive", true);
		m.addAttribute("gender", "F");

		List<Integer> list = List.of(12, 32, 43, 45, 65, 21, 98);

		m.addAttribute("mylist", list);

		return "conditional";
	}

	// Include (fragments)
	@GetMapping("/ex-fragment")
	public String serviceHandler(Model m) {

		// dynamic value Example
		m.addAttribute("title", "About Learning Thymeleaf");
		m.addAttribute("subtitle", new Date().toString());
		// dynamic value Example

		return "fragment";
	}

	// for new about
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}
	
	
	// example controller of css and js
	@RequestMapping("/example")
	public String example() {
		
		return "example";
		
	}
	
	
	

}
