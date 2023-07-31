package com.te.hibernatedemo.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//				ONE TO MANY EXAMPLE
		//			HERE COUNTRY IS INDEPENDENT COZ STATES CANNOT EXIST WITHOUT AUTHORS 
@Entity
@Table(name="Country_Info")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int countryId;
	private String countryName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<State>states;
	/**
	 * @return the countryId
	 */
	public int getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * @return the states
	 */
	public List<State> getStates() {
		return states;
	}
	/**
	 * @param states the states to set
	 */
	public void setStates(List<State> states) {
		this.states = states;
	}
	
	
	
	
}
