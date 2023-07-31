package com.te.hibernatedemo.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="worshipers_info")
public class Worshipers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int worshipersId;
	private String worshiperName;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Gods> gods;
	/**
	 * @return the worshipersId
	 */
	public int getWorshipersId() {
		return worshipersId;
	}
	/**
	 * @param worshipersId the worshipersId to set
	 */
	public void setWorshipersId(int worshipersId) {
		this.worshipersId = worshipersId;
	}
	/**
	 * @return the worshiperName
	 */
	public String getWorshiperName() {
		return worshiperName;
	}
	/**
	 * @param worshiperName the worshiperName to set
	 */
	public void setWorshiperName(String worshiperName) {
		this.worshiperName = worshiperName;
	}
	/**
	 * @return the gods
	 */
	public List<Gods> getGods() {
		return gods;
	}
	/**
	 * @param gods the gods to set
	 */
	public void setGods(List<Gods> gods) {
		this.gods = gods;
	}
	
}
