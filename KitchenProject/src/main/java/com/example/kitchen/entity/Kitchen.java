package com.example.kitchen.entity;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Kitchen123")
public class Kitchen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	private ArrayList<MenuItem> menu;
	private ArrayList<Order> orders;
	private String name;
	private String email;
	private String password;
	private Date working_days;
	
	public Kitchen() {
		this.menu = new ArrayList<MenuItem>();
		this.orders = new ArrayList<Order>();
	}
	public Kitchen(int id, String name, String email, String password,
			Date working_days, String image) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.working_days = working_days;
		this.image = image;
		
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getWorking_days() {
		return working_days;
	}
	public void setWorking_days(Date working_days) {
		this.working_days = working_days;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	private String image;

}