package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	public long myCounter=0;
	
	@RequestMapping("/")
	public String increment() {
		if(myCounter == Long.MAX_VALUE -1)
			myCounter = 0;
		
		return String.valueOf(myCounter++);
	}

}
