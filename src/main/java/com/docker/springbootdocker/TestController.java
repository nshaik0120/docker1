package com.docker.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	
	@GetMapping("/welcome1")
	public String test2() {
		
		return "welcome to docker aws ec2";
	}

}
