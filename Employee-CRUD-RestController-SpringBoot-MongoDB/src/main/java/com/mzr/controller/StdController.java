package com.mzr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mzr.model.Student;
import com.mzr.service.StudentService;

@RestController
@RequestMapping("/std")
public class StdController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/insert")
	public String insert(@RequestBody Student s) {
		return service.insert(s);
	}
	@GetMapping("/all")
	public List<Student> getAll(){
		return service.getAll();
	}
	@PostMapping("/findById")
	public Student findById(@RequestBody Student s) {
		return service.findById(s.getRoll());
	}
	@PostMapping("/update")
	public String update(@RequestBody Student s) {
		return service.update(s);
	}
	@PostMapping("/delete")
	public String delete(@RequestBody Student s) {
		return service.delete(s.getRoll());
	}
	@PostMapping("/byname")
	public Student getByName(@RequestBody Student s) {
		return service.findByName(s.getName());
	}

}
