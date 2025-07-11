package com.tnsif.courseservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.courseservice.entity.Course;
import com.tnsif.courseservice.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	//to save the record(inserting)
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}
	
	//to retrive all records
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}

}