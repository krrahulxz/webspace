package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {
	@RequestMapping("/1")
	public String index() {
		return "index";
	}
	@RequestMapping("/2")
	public String index1() {
		return "backup/xyz";
	}
}
