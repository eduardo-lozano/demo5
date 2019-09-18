package com.demo.eduardo.demo5.entity;

import javax.persistence.Entity;		// There's more than one Entity option, we use the javax.persistence
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity		// Something to be persisted to a database.
public class SomeUser {
	
	// Primary key
	@Id
	@GeneratedValue		// You don't set the value, it's auto-generated.
	private long id;
	
	private String fullName;
	
	private String role;
	
	// JPA expects a default constructor in the entities.
	protected SomeUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Skip the id field in the constructor.
	public SomeUser(String fullName, String role) {
		super();
		this.fullName = fullName;
		this.role = role;
	}

	// Include only getters, no setters
	public long getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "SomeUser [id=" + id + ", Full name=" + getFullName() + ", role=" + role + "]";
	}
}
