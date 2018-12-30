package com.platzi.profesoresPlatzi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String response = "Welcome to <a href='http://www.Platzi.com'>platzi.com</a>";
		return response;
	}

}
