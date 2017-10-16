package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Faculty;
import com.example.demo.repository.FacultyRepository;


public class FacultyService {
	@Autowired
	FacultyRepository repository;
	
	public List<Faculty> findAll() {
		List<Faculty> x=new ArrayList<>();
		for(Faculty user:repository.findAll()) {
			x.add(user);
		}
		return x;
	}
	public Faculty findOne(int id) {
		return repository.findOne(id);
	}
	public void delete(int id) {
		repository.delete(id);
	}
	public void save(Faculty user) {
		repository.save(user);
	}

}
