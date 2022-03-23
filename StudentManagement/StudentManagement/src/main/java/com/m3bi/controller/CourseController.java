package com.m3bi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.m3bi.model.Course;
import com.m3bi.repository.CourseRepo;
import com.m3bi.service.CourseServiceImpl;

@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	CourseServiceImpl courseserviceimpl;
	
	@Autowired
	CourseRepo courserepoimpl;
	
	@GetMapping("/getdatabyid/{courseId}")
	public Optional<Course> getDataById(@PathVariable int courseId)
	{
		return courseserviceimpl.getDataById(courseId);
	}
	
	@GetMapping("/getalldata")
	public List<Course> getAllData()
	{
		return courseserviceimpl.getAllData();
	}
	
	
	
	@PostMapping("/savedata")
	public Course saveData(@RequestBody Course course)
	{
		return courseserviceimpl.saveData(course);
	}
	
	
	
	
	@DeleteMapping("/deletedatabyid/{courseid}")
	public String deleteDataById(@PathVariable int courseId)
		{
		courseserviceimpl.deleteDataById(courseId);
		
		return "Data Deleted Successfully";
		}
	
	
	
	
	
	
	
}
