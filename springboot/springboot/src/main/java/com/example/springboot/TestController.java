package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/")
	public String handlerTest() {
		return "home";
	}

	@RequestMapping("/contact")
	public String contactPage(Model m) {

		m.addAttribute("c", "This is contact..");

		return "contact";
	}

}
