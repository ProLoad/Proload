package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;
import com.example.demo.repository.UserRepository;

public class ContactService {

	@Autowired
	ContactRepository repository;
	
	public List<Contact> findAll() {
		List<Contact> x=new ArrayList<>();
		for(Contact contact:repository.findAll()) {
			x.add(contact);
		}
		return x;
	}
	public Contact findOne(int id) {
		return repository.findOne(id);
	}
	public void delete(int id) {
		repository.delete(id);
	}
	public void save(Contact contact) {
		repository.save(contact);
	}

}
