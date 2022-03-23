package com.m3bi.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.m3bi.model.Course;
import com.m3bi.repository.CourseRepo;

@Component
public class CourseDaoImpl {

	@Autowired
	CourseRepo courserepoimpl;

	public Optional<Course> getDataById(int courseId) {
		// TODO Auto-generated method stub
		return courserepoimpl.findById(courseId);
	}

	public List<Course> getAllData() {
		// TODO Auto-generated method stub
		return courserepoimpl.findAll();
	}

	public Course saveData(Course course) {
		// TODO Auto-generated method stub
		return courserepoimpl.save(course);
	}


	

	public void deleteDataById(int courseId) {
		// TODO Auto-generated method stub
		courserepoimpl.deleteById(courseId);
	}



	
	
}
