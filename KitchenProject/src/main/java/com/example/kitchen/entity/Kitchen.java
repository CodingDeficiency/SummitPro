package com.example.kitchen.entity;
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
	int id;
	String name;
	String email;
	String password;
	String working_days;
	String image;

}
