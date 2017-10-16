package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Activity;
import com.example.demo.repository.ActivityRepository;
import com.example.demo.repository.UserRepository;

public class ActivityService {

	@Autowired
	ActivityRepository repository;
	
	public List<Activity> findAll() {
		List<Activity> x=new ArrayList<>();
		for(Activity activity:repository.findAll()) {
			x.add(activity);
		}
		return x;
	}
	public Activity findOne(int id) {
		return repository.findOne(id);
	}
	public void delete(int id) {
		repository.delete(id);
	}
	public void save(Activity activity) {
		repository.save(activity);
	}

}
