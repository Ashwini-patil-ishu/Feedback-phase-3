package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeedbackController {
	
	@Autowired
	private AppService appService;
	
	@GetMapping("/feedback")
	public String feedback() {
		return "feedback";
	}

}
