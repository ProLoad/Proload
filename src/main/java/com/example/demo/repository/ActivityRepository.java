package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Activity;

public interface ActivityRepository extends CrudRepository<Activity,Integer> {

}
