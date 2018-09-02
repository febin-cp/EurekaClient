package com.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/hello")
	public String sayHello(String name) {
		return "Hello " + name ;
	}

}
