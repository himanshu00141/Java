package com.dream.sms.service;

import java.util.List;

import com.dream.sms.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();

	
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
