package com.ebs.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping(path = "/")
	public String home() {
		return "Home";
	}
}
