package com.harsh.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.harsh.dto.Student;
import com.harsh.reposistory.StudentReposistory;

@Repository
public class StudentDao {

	@Autowired
	StudentReposistory reposistory;

	public void saveStudent(Student student) {
		reposistory.save(student);
	}

	public List<Student> getAllStudents() {
		return reposistory.findAll();

	}
	// getById

	public int getById(int id) {
		Optional<Student> optional = reposistory.findById(id);

		if (optional.isPresent()) {
			return optional.get().getStdId();
		} else {
			return 0;
		}
	}

	// Delete By id
	public void deleteStudentById(int id) {
		Optional<Student> optional = reposistory.findById(id);
		if (optional.isPresent()) {
			Student student = optional.get();
			reposistory.delete(student);
		}
	}

	// update
	public Student updateStudent(int id) {
		return reposistory.findById(id).get();
		
	}
}
