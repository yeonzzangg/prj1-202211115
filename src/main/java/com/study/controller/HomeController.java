package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("")
	@ResponseBody
	public String home() {
		return "welcom home!!!!";
	}
	
	@RequestMapping("index")
	public void index() {
		
	}
	
	
}
