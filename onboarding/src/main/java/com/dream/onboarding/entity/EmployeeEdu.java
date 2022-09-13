package com.dream.onboarding.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EmployeeEdu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long marks;
	
	@Column(name="qualification", nullable = false)
	private String qualification;
	
	@Column(name="eduType")
	private String eduType;
	
	@Column(name="degree ")
	private String degree;
	
	@Column(name="uniName")
	private String uniName;
	
	public EmployeeEdu() {
		
	}
	
	public EmployeeEdu(String firstName, String lastName, String email, String degree, String eduType, String qualification, String uniName, Long marks) {
		super();
		this.qualification = qualification;
		this.eduType = eduType;
		this.degree = degree;
		this.marks = marks;
		this.uniName = uniName;
		
		
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEduType() {
		return eduType;
	}

	public void setEduType(String eduType) {
		this.eduType = eduType;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
}
	