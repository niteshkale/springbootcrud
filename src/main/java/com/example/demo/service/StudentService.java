package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.StudentEntity;
@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	public StudentEntity create(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		StudentEntity studnet=studentDAO.save(studentEntity);
		return studnet;
	}

}
