package com.m3bi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m3bi.dao.CourseDaoImpl;
import com.m3bi.model.Course;

@Service
public class CourseServiceImpl {

	@Autowired
	CourseDaoImpl coursedaoimpl;

	public List<Course> getAllData() {
		// TODO Auto-generated method stub
		return coursedaoimpl.getAllData();
	}

	public Optional<Course> getDataById(int courseId) {
		// TODO Auto-generated method stub
		return coursedaoimpl.getDataById(courseId);
	}

	public Course saveData(Course course) {
		// TODO Auto-generated method stub
		return coursedaoimpl.saveData(course);
	}


	public void deleteDataById(int courseId) {
		// TODO Auto-generated method stub
		coursedaoimpl.deleteDataById(courseId);
	}

}
