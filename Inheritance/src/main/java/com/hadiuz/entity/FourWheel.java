package com.hadiuz.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity 
@DiscriminatorValue(value = "four")
public class FourWheel extends Vehicle
{
    private int modelno;
	private String modelname;
	private boolean musicsystem;
	private String etype;
	private boolean ac;
 	
}
