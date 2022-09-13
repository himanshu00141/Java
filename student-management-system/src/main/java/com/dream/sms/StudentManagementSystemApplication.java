package com.dream.sms;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.dream.sms.repository.StudentRepository;



@SpringBootApplication
public class StudentManagementSystemApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	public void run(String... args) throws Exception {
		
		
	}
	
}
