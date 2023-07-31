package com.te.hibernatedemo.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//											MAPPING
//							MANY TO ONE-----> ONE TEACHER TAKING MULTIPLE SUBJECTS
@Entity
@Table(name="teach_info")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherId;
	private String teacherName;
	private String gender;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Subject>list;
	/**
	 * @return the list
	 */
	public List<Subject> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<Subject> list) {
		this.list = list;
	}
	/**
	 * @return the teacherId
	 */
	public int getTeacherId() {
		return teacherId;
	}
	/**
	 * @param teacherId the teacherId to set
	 */
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	/**
	 * @return the teacherName
	 */
	public String getTeacherName() {
		return teacherName;
	}
	/**
	 * @param teacherName the teacherName to set
	 */
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

}
