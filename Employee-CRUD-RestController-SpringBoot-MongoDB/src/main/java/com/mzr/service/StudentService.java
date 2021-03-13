package com.mzr.service;

import java.util.List;

import com.mzr.model.Student;

public interface StudentService {
	
	public String insert(Student s);
	public List<Student> getAll();
	public String update(Student s);
	public String delete(Integer roll);
	public Student findById(Integer roll);
	public Student findByName(String nm);

}
