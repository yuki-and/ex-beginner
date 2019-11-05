package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Ex01Form;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {
	
	@ModelAttribute
	public Ex01Form setUpForm() {
		return new Ex01Form();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/input")
	public String input(Ex01Form form, Model model) {
		model.addAttribute("name", form.getName());
		System.out.println("入力された値：" + form.getName());
		return "exam01-result";
	}
	

}
