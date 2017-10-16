package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Privince;
import com.example.demo.model.Province;

public interface ProvinceRepository extends CrudRepository<Privince,Integer>{

}
