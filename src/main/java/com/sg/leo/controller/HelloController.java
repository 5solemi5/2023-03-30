package com.sg.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Annotation
public class HelloController {
	@GetMapping("/html")
	public String html() {
		System.out.println("HTML 파일이 요청됨");
		return "redirect:starthere.html";
	}
	@GetMapping("/img")
	public String img() {
		System.out.println("이미지 파일이 요청됨");
		return "redirect:img/chat.jpg";
	}
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("JSP 파일이 요청됨");
		model.addAttribute("username", "흐흠 최은주");
		return "hellojsp";
	}


	@GetMapping("/")
	public String getBegnpoint() {
		return "index";
	}
	
}
