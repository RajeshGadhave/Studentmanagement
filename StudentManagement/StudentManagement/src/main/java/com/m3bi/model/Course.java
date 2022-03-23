package com.m3bi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseid;
	private String courseName;
	private double cousreFee;
	
	
	
	public Course() 
	{
		
	}



	public Course(int courseid, String courseName, double cousreFee) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.cousreFee = cousreFee;
	}
	
	
	
}

