package com.javaravi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsDemoController {
	
	@GetMapping("/demo")
	public String getUserDetails(@RequestParam("name") String name) {
		return "Hi "+name+" Jenkins CI&CD Demo says Welcome To You!";
	}
	
	@GetMapping("/test")
	public String test(@RequestParam("name") String name) {
		return "Hi "+name+" Jenkins CI&CD Testing!";
	}

}
