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
	
	public Order(int id, Date timeOrd, float amountPaid) {
		super();
		this.id = id;
		this.timeOrd = timeOrd;
		this.amountPaid = amountPaid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTimeOrd() {
		return timeOrd;
	}
	public void setTimeOrd(Date timeOrd) {
		this.timeOrd = timeOrd;
	}
	public float getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}
	
}
