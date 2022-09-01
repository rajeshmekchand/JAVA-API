package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	DAO dao;
	@RequestMapping(path ="/data")
	public List<Medicine_Modified> getData(){
		return dao.findAll();
	}
	@RequestMapping(path ="/data/{id}")
	public Optional<Medicine_Modified> getDatabyId(@PathVariable("id")int id){
		return dao.findById(id);
		
	}
	@PostMapping( path ="/data")
	public Medicine_Modified saveData(Medicine_Modified med) {
		dao.save(med);
		return med;
	}
	
}
