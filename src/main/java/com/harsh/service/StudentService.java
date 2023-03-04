package com.harsh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.dao.StudentDao;
import com.harsh.dto.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	public void saveStudent(Student student) {
		dao.saveStudent(student);
	}

	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

	// getById
	public int getById(int id) {
		return dao.getById(id);
	}

	// delete by id
	public void deleteStudentById(int id) {
		if (dao.getById(id) != 0) {
			dao.deleteStudentById(id);
			System.out.println("data delete sucessfully..");
		} else {
			System.out.println("id not found");
		}
	}
	public Student updateStudent(int id) {
		return dao.updateStudent(id);
	}
}
