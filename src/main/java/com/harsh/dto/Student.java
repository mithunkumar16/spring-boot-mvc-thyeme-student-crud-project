package com.harsh.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentid")
	private int stdId;
	@Column(name = "studentname")
	private String stdName;
	@Column(name = "studentemail",nullable = false)
	private String stdEmail;
	@Column(name = "studentmobile")
	private String stdMobile;
	
	
	
	public Student() {
		
	}
	public Student(int stdId, String stdName, String stdEmail, String stdMobile) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdEmail = stdEmail;
		this.stdMobile = stdMobile;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdEmail() {
		return stdEmail;
	}
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}
	public String getStdMobile() {
		return stdMobile;
	}
	public void setStdMobile(String stdMobile) {
		this.stdMobile = stdMobile;
	}
	
	

}
