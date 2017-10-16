package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Privince;

public interface UserRepository extends CrudRepository<Privince,Integer> {

}
