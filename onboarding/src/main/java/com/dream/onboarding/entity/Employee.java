package com.dream.onboarding.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long number;
		
		@Column(name="first_name", nullable = false)
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
		
		@Column(name="email ")
		private String email;
		
		public Employee() {
			
		}
		
		public Employee(String firstName, String lastName, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
		public Long getId() {
			return number;
		}
		public void setId(Long number) {
			this.number = number;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		}
		
