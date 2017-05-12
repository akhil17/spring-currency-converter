package com.currency.model;

import java.util.Date;
import java.util.Map;

import javax.persistence.Entity;

@Entity
public class Currency {

	private String base;
	private Date date;
	private Map<String, Float> currentRates;
	
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Map<String, Float> getCurrentRates() {
		return currentRates;
	}
	public void setCurrentRates(Map<String, Float> currentRates) {
		this.currentRates = currentRates;
	}
	
	
	
	
}