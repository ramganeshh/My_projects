package com.te.hibernatedemo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity 
@Table(name="student_info")
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;
private String dept;
private String degree;
private String aim;
private String name;



/**
 * @return the id
 */
public int getId() {
	return Id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	Id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the dept
 */
public String getDept() {
	return dept;
}
/**
 * @param dept the dept to set
 */
public void setDept(String dept) {
	this.dept = dept;
}
/**
 * @return the degree
 */
public String getDegree() {
	return degree;
}
/**
 * @param degree the degree to set
 */
public void setDegree(String degree) {
	this.degree = degree;
}
/**
 * @return the aim
 */
public String getAim() {
	return aim;
}
/**
 * @param aim the aim to set
 */
public void setAim(String aim) {
	this.aim = aim;
}





}
