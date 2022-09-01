package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Chai {
	@Id
	@GeneratedValue
	private int id;
	private String chainame;
	private String price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChainame() {
		return chainame;
	}
	public void setChainame(String chainame) {
		this.chainame = chainame;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Chai [id=" + id + ", chainame=" + chainame + ", price=" + price + "]";
	}

}
