package com.te.hibernatedemo.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

				// MAPPING
@Entity
@Table(name = "MyCars")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	private String carName;
	private int carPrice;
	@OneToOne(cascade = CascadeType.ALL)
	private Engine engine;
	/**
	 * @return the carId
	 */
	public int getCarId() {
		return carId;
	}
	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	/**
	 * @param carId the carId to set
	 */
	public void setCarId(int carId) {
		this.carId = carId;
	}
	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}
	/**
	 * @param carName the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}
	/**
	 * @return the carSalary
	 */
	public int getCarPrice() {
		return carPrice;
	}
	/**
	 * @param carSalary the carSalary to set
	 */
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	
}
