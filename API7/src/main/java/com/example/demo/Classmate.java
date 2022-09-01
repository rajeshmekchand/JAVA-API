package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Classmate {
	@Id
	@GeneratedValue
	
	private int id;
	private String name;
	private String classname;
	private String sectionno;
	private String rollno;
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
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getSectionno() {
		return sectionno;
	}
	public void setSectionno(String sectionno) {
		this.sectionno = sectionno;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Classmate [id=" + id + ", name=" + name + ", classname=" + classname + ", sectionno=" + sectionno
				+ ", rollno=" + rollno + "]";
	}
	

}
