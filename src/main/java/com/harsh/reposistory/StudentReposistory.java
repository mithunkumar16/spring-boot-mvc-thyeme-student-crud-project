package com.harsh.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.dto.Student;

public interface StudentReposistory extends JpaRepository<Student, Integer> {
	
	//public List<Student> getAllStudent();

}
