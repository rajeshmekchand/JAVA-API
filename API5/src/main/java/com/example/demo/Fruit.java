package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Fruit {
	@Id
	@GeneratedValue
	
	private int id;
	private String name;
    private String price;
    private String quntity;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuntity() {
		return quntity;
	}
	public void setQuntity(String quntity) {
		this.quntity = quntity;
	}
	@Override
	public String toString() {
		return "Fruits [id=" + id + ", name=" + name + ", price=" + price + ", quntity=" + quntity + "]";
	}
    
}
	