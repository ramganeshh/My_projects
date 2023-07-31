package com.te.hibernatedemo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//							MAPPING
//			ONE TO ONE
			
@Entity
@Table(name="MyEngineCollection")
public class Engine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	private String engineName;
	
	/**
	 * @return the eId
	 */
	public int geteId() {
		return eId;
	}
	/**
	 * @param eId the eId to set
	 */
	public void seteId(int eId) {
		this.eId = eId;
	}
	
	/**
	 * @return the engineName
	 */
	public String getEngineName() {
		return engineName;
	}
	/**
	 * @param engineName the engineName to set
	 */
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	
}
