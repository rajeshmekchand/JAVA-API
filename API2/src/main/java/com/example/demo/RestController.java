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
	public List<Coffee> getData(){
		return dao.findAll();
	}
  @RequestMapping(path ="/data/{id}")
  public Optional<Coffee> getDatabyId(@PathVariable("id") int id){
	return dao.findById(id);
	  
	  
  }
  @PostMapping(path ="/data")
  public Coffee saveData (Coffee cf) {
	  dao.save(cf);
	  return cf;
	  
  }
 

}
