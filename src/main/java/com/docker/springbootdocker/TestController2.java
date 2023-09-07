package com.docker.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
	
	
	
	@GetMapping("/welcome2")
	public String test2() {
		
		return "welcome2 to docker aws ec2";
	}

}
