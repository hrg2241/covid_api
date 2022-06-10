package com.training.amdocs.entities;

import org.springframework.stereotype.Component;

@Component
public class Centers 
{
	int center_id;
	String center_name;
	int pincode;
	public Centers() {
		super();
	}
	public Centers(int center_id, String center_name, int pincode) {
		super();
		this.center_id = center_id;
		this.center_name = center_name;
		this.pincode = pincode;
	}
	public int getCenter_id() {
		return center_id;
	}
	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}
	public String getCenter_name() {
		return center_name;
	}
	public void setCenter_name(String center_name) {
		this.center_name = center_name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
}
