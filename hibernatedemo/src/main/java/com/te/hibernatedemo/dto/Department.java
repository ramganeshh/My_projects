package com.te.hibernatedemo.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="dept_info")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> listOfemployee;
	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return the listOfemployee
	 */
	public List<Employee> getListOfemployee() {
		return listOfemployee;
	}
	/**
	 * @param listOfemployee the listOfemployee to set
	 */
	public void setListOfemployee(List<Employee> listOfemployee) {
		this.listOfemployee = listOfemployee;
	}

}
