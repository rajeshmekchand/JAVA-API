package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Medicine_Modified {
	@Id
	@GeneratedValue
 private int id;
 private String name;
 private int mg;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMg() {
	return mg;
}
public void setMg(int mg) {
	this.mg = mg;
}
@Override
public String toString() {
	return "Medicine [id=" + id + ", name=" + name + ", mg=" + mg + "]";
}
}
