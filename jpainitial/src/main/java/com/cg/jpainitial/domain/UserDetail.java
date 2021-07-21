package com.cg.jpainitial.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetail {
	@Id 
	private int id;
	private String name;
	private String contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
