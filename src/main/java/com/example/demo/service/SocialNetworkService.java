package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.SocialNetwork;
import com.example.demo.model.SocialNetwork;
import com.example.demo.repository.ActivityRepository;
import com.example.demo.repository.SocialNetworkRepository;

public class SocialNetworkService {

	@Autowired
	SocialNetworkRepository repository;
	
	public List<SocialNetwork> findAll() {
		List<SocialNetwork> x=new ArrayList<>();
		for(SocialNetwork activity:repository.findAll()) {
			x.add(activity);
		}
		return x;
	}
	public SocialNetwork findOne(int id) {
		return repository.findOne(id);
	}
	public void delete(int id) {
		repository.delete(id);
	}
	public void save(SocialNetwork activity) {
		repository.save(activity);
	}
}
