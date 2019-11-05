package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Ex02Form;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "exam02";
	}

	@RequestMapping("/addition")
	public String addition(Ex02Form form) {
		session.setAttribute("num1", form.getNum1());
		session.setAttribute("num2", form.getNum2());
		session.setAttribute("answer", form.getNum1() + form.getNum2());
		return "exam02-result";
	}

	@RequestMapping("/to-next")
	public String toNext() {
		return "exam02-result2";
	}
}
