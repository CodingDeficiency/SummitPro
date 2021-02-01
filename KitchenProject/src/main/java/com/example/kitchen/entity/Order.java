package com.example.kitchen.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order123")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	private Date timeOrd;
	private float amountPaid;
	

}