package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
	
	@Autowired
	private MyRepo myRepo;
	
	public boolean addFeedback( Feedback f) {
		myRepo.save(f);
		return true;
	}

}
