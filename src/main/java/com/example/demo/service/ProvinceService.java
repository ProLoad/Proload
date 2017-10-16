package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Activity;
import com.example.demo.model.Privince;
import com.example.demo.repository.ActivityRepository;
import com.example.demo.repository.ProvinceRepository;

public class ProvinceService {
	
	@Autowired
	ProvinceRepository repository;
	public List<Privince> findAll(){
		List<Privince> x=new ArrayList<>();
		for(Privince activity:repository.findAll()) {
			x.add(activity);
		}
		return x;
	}
	public Privince findOne(int id) {
		return repository.findOne(id);
	}
	public void delete(int id) {
		repository.delete(id);
	}
	public void save(Privince activity) {
		repository.save(activity);
	}	
	
}
