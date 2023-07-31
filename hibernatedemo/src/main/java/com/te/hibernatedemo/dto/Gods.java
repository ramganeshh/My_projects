package com.te.hibernatedemo.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "gods_info")
public class Gods {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int godId;
	private String godName;
	
	public int getGodId() {
		return godId;
	}
	/**
	 * @param godId the godId to set
	 */
	public void setGodId(int godId) {
		this.godId = godId;
	}
	/**
	 * @return the godName
	 */
	public String getGodName() {
		return godName;
	}
	/**
	 * @param godName the godName to set
	 */
	public void setGodName(String godName) {
		this.godName = godName;
	}
	/**
	 * @return the list
	 */
	
}
