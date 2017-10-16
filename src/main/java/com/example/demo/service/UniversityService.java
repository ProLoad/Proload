package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.University;
import com.example.demo.repository.ActivityRepository;
import com.example.demo.repository.UniversityRepository;

public class UniversityService {

	@Autowired
	UniversityRepository repository;
	
	public List<University> findAll() {
		List<University> x=new ArrayList<>();
		for(University activity:repository.findAll()) {
			x.add(activity);
		}
		return x;
	}
	public University findOne(int id) {
		return repository.findOne(id);
	}
	public void delete(int id) {
		repository.delete(id);
	}
	public void save(University activity) {
		repository.save(activity);
	}
}
