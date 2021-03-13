package com.mzr.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mzr.model.Student;

public interface StudentRepo extends MongoRepository<Student, Integer> {
	
	public Student findByName(String nm);

}
