package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	DAO dao;
	
	
	@RequestMapping(path ="/data")
	public List<Chai> getData(){
		return dao.findAll();
	}
	@RequestMapping( path ="/data/{id}")
	public Optional<Chai> getDatabyId (@PathVariable("id")int id){
		return dao.findById(id);
		
	}
	@PostMapping( path ="/data")
	public Chai saveData(Chai med) {
		dao.save(med);
		return med;
	}
	@DeleteMapping(path ="/data/{id}")
	public String deleteDatabyid(@PathVariable("id")int id) {
	    Chai ci=dao.getById(id);
	    dao.delete(ci);
		return "entery deleted";
		
	}
	@PutMapping( path= "/data")
	public Chai updateData(Chai ci) {
	dao.save(ci);
	return ci;
}
}