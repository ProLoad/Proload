package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.WorkExperience;
import com.example.demo.model.WorkExperience;
import com.example.demo.repository.ActivityRepository;
import com.example.demo.repository.WorkExperienceRepository;

public class WorkExperienceService{

	@Autowired
	WorkExperienceRepository repository;
	
	public List<WorkExperience> findAll() {
		List<WorkExperience> x=new ArrayList<>();
		for(WorkExperience activity:repository.findAll()) {
			x.add(activity);
		}
		return x;
	}
	public WorkExperience findOne(int id) {
		return repository.findOne(id);
	}
	public void delete(int id) {
		repository.delete(id);
	}
	public void save(WorkExperience activity) {
		repository.save(activity);
	}

}
