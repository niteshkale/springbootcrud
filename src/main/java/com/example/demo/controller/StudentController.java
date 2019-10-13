package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public StudentEntity create(@RequestBody StudentEntity studentEntity) {

		return studentService.create(studentEntity);
		
	}
}
