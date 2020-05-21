package com.cyberlogitec.jwat.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyberlogitec.jwat.mybatis.model.StudentModel;
import com.cyberlogitec.jwat.mybatis.pojo.Student;
import com.cyberlogitec.jwat.mybatis.service.IStudentService;

@Controller
@RequestMapping(value = "student/*")
public class StudentController {

	@Autowired
	IStudentService studentService;
	
	@RequestMapping(value = "getAllStudent")
	@ResponseBody
	public List<Student> getAllStudent(){
		return studentService.selectAllStudent();
	}
	
	@RequestMapping(value = "getStudentByUserInput" , method = RequestMethod.POST, headers = { "content-type=application/json" })
	@ResponseBody
	public List<Student> getStudentByUserInput(@RequestBody StudentModel studentModel){
		return studentService.selectStudentByUserInput(studentModel);
	}
	
	@RequestMapping(value = "addStudent" , method = RequestMethod.POST, headers = { "content-type=application/json" })
	@ResponseBody
	public String addStudent(@RequestBody StudentModel studentModel){
		return studentService.insertStudent(studentModel);
	}
	
	@RequestMapping(value = "editStudent" , method = RequestMethod.POST, headers = { "content-type=application/json" })
	@ResponseBody
	public String editStudent(@RequestBody StudentModel studentModel){
		return studentService.updateStudent(studentModel);
	}
	
	@RequestMapping(value = "deleteStudent", method = RequestMethod.POST)
	@ResponseBody
	public String deleteStudent(@RequestParam("id") int studentId) {
		return studentService.deleteStudentById(studentId);
	}
	
	
}
