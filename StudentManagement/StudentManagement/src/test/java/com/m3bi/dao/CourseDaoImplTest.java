package com.m3bi.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.m3bi.model.Course;
import com.m3bi.repository.CourseRepo;

class CourseDaoImplTest {

	
	@Autowired
	CourseDaoImpl courseDaoImpl;

	@MockBean
	CourseRepo courseRepo;
	

	@Test
	public void saveDataTest() {
		
		Course course = new Course(21, "Mysql", 8963.54);
		courseDaoImpl.saveData(course);
		assertNotNull(course);
		assertEquals(1, courseDaoImpl.getAllData().size());
		
	}
	
	@Test
	@Disabled
	public void getDataByidTest() {

		Course course = new Course(23, "Python", 8863.54);
		courseDaoImpl.getDataById(4);
		verify(courseRepo, times(1)).deleteById(null);
	}

	@Test
	@Disabled
	public void getAllDataTest() {
		when(courseRepo.findAll()).thenReturn(
				Stream.of(new Course(11, "Java", 9632.55), new Course(12, "OOP", 563.86)).collect(Collectors.toList()));

		assertEquals(2, courseDaoImpl.getAllData().size());
	}


	@Test
	@Disabled
	public void DeleteDataByidTest() {

		Course course = new Course(23, "Python", 8863.54);
		courseDaoImpl.deleteDataById(0);
		verify(courseRepo, times(1)).deleteById(null);
	}
}



