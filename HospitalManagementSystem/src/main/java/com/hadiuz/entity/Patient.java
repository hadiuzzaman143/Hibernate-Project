package com.hadiuz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	@Column(length = 35,nullable = false)
	private String pname;
	@Column(length = 15,nullable = false)
	private String padd;
	@Column(length = 10,nullable = false)
	private long pphone;
	@Column(length = 15,nullable = false)
	private double pfee;
	
}
