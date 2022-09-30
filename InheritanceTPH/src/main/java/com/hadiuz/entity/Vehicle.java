package com.hadiuz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
 
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
 
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vid;
	@Column(length = 20)
	private String fuel;
	@Column(length = 20)
	private String engine;
	@Column(length = 4)
	private int speed;
	@Column(length = 20)
	private String vtype;
	@Column(length = 10)
	private double price; 
}
