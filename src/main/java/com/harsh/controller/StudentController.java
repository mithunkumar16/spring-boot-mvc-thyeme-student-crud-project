package com.harsh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.harsh.dto.Student;
import com.harsh.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
//	public void saveStudent(Student student) {
//		dao.saveStudent(student);
//	}
	@GetMapping("/")
	public String liststudent(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	@GetMapping("/newAddStudent")
	public String insertStudentFormOpen(Model model) {
		model.addAttribute("student",new Student());
		return "insertStudent";
	}
	
	@RequestMapping(value = "/addStudents",method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable(name = "id") int id) {
		studentService.deleteStudentById(id);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editstudent(@PathVariable(name = "id") int id) {
		ModelAndView andView=new ModelAndView("insertStudent");
		Student student=studentService.updateStudent(id);
		andView.addObject("student",student);
		return andView;
	}
}
