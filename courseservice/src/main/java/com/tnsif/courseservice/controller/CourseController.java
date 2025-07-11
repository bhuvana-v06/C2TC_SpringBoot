package com.tnsif.courseservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.courseservice.entity.Course;
import com.tnsif.courseservice.service.CourseService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course")
	public Course createCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}
	

}
