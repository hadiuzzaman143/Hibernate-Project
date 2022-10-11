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

public class Doctor  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	@Column(length = 20,nullable = false)
	private String dname;
	@Column(length = 15,nullable = false)
	private String ddept;
	@Column(length = 10,nullable = false)
	private long dphone;
	@Column(length = 20,nullable = false)
	private String demail;
	 
}
