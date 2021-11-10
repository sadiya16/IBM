package com.ibm.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/welcome")
	public  String welcome() {
		return "Welcome to boot Application";
	}

}
