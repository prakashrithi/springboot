package com.test.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public static String welcome() {
		return "Deploying springboot rest api application on aws using Elastic beanstalk";
	}

}
