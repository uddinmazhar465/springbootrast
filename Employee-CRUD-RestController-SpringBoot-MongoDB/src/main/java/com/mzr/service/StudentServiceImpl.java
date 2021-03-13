package com.mzr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzr.model.Student;
import com.mzr.repo.StudentRepo;
@Service("stdService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo repo;
	
	@Override
	public String insert(Student s) {
		return repo.save(s)!=null?"Roll : "+s.getRoll()+" is saved":"Roll : "+s.getRoll()+" is not saved";
	}

	@Override
	public List<Student> getAll() {
		return repo.findAll();
	}

	@Override
	public String update(Student s) {
		return repo.save(s)!=null?"Roll :"+s.getRoll()+" is updated":"Roll :"+s.getRoll()+" is not updated";
	}

	@Override
	public String delete(Integer roll) {
		String msg = null;
		if(roll!=0) {
			repo.deleteById(roll);
			msg = "Roll : "+roll+" is deleted";
		}
		else {
			msg = "Record not found";
		}
		return msg;
	}

	@Override
	public Student findById(Integer roll) {
		return repo.findById(roll).get();
	}

	@Override
	public Student findByName(String nm) {
		
		return repo.findByName(nm);
	}

}
