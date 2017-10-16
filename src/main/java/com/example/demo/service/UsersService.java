package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Privince;
import com.example.demo.repository.UserRepository;

@Service
public class UsersService  {

	@Autowired
	UserRepository repository;
	
	public List<Privince> findAll() {
		List<Privince> x=new ArrayList<>();
		for(Privince user:repository.findAll()) {
			x.add(user);
		}
		return x;
	}
	public Privince findOne(int id) {
		return repository.findOne(id);
	}
	public void delete(int id) {
		repository.delete(id);
	}
	public void save(Privince user) {
		repository.save(user);
	}

}
