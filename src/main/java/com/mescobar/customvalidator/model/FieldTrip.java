package com.mescobar.customvalidator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FieldTrip {

	@Id
    private long id;
	
    private String name;
    private int age;
    private String guardian;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
    
    
    
}
