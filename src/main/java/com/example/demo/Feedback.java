package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Feedback {
	
	public Feedback(String firstname2, String lastname2, String email2, String feedback12) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email= email;
		this.feedback1 = feedback1;
	}
	@Id 
	@GeneratedValue
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String feedback1;
	

}
