package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.UserRepository;

public class DepartmentService {

	@Autowired
	DepartmentRepository repository;
	
	public List<Department> findAll() {
		List<Department> x=new ArrayList<>();
		for(Department user:repository.findAll()) {
			x.add(user);
		}
		return x;
	}
	public Department findOne(int id) {
		return repository.findOne(id);
	}
	public void delete(int id) {
		repository.delete(id);
	}
	public void save(Department user) {
		repository.save(user);
	}

}
