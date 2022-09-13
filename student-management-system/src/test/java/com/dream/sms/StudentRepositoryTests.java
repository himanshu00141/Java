//package com.dream.sms;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.test.annotation.Rollback;
//
//import javax.sql.DataSource;
//import java.util.List;
//import java.util.Optional;
//
//import com.dream.sms.entity.Student;
//import com.dream.sms.repository.StudentRepository;
//
//@DataJpaTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//	public class StudentRepositoryTests {
//
//	    @Autowired
//	    private StudentRepository studentRepository;
//
//	   
//	    @Test
//	    @Order(1)
//	    @Rollback(value = false)
//	    public void saveStudentTest(){
//
//	        Student employee = Student.builder()
//	                .firstName("Ramesh")
//	                .lastName("Fadatare")
//	                .email("ramesh@gmail.com")
//	                .build();
//
//	        studentRepository.save(employee);
//
//	        Assertions.assertThat(employee.getId()).isGreaterThan(0);
//	    }
//
//	    @Test
//	    @Order(2)
//	    public void getStudentTest(){
//
//	        Student employee = studentRepository.findById(1L).get();
//
//	        Assertions.assertThat(employee.getId()).isEqualTo(1L);
//
//	    }
//
//	    @Test
//	    @Order(3)
//	    public void getListOfStudentTest(){
//
//	        List<Student> employees = studentRepository.findAll();
//
//	        Assertions.assertThat(employees.size()).isGreaterThan(0);
//
//	    }
//
//	    @Test
//	    @Order(4)
//	    @Rollback(value = false)
//	    public void updateStudentTest(){
//
//	        Student student = studentRepository.findById(1L).get();
//
//	        student.setEmail("ram@gmail.com");
//
//	        Student studentUpdated =  studentRepository.save(student);
//
//	        Assertions.assertThat(studentUpdated.getEmail()).isEqualTo("ram@gmail.com");
//
//	    }
//
//	    @Test
//	    @Order(5)
//	    @Rollback(value = false)
//	    public void deleteStudentTest(){
//
//	        Student student = studentRepository.findAll().get(1);
//
//	        studentRepository.delete(student);
//
//
//	        Student student1 = null;
//
//	        List<Student> optionalStudent =studentRepository.findAll();
//
//	        if(optionalStudent.isPresent()){
//	            student1 = optionalStudent.get(1);
//	        }
//
//	        Assertions.assertThat(student1).isNull();
//	    }
//
//	}
//
//}
