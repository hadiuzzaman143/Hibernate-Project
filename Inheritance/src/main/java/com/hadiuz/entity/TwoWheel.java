package com.hadiuz.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity 
@DiscriminatorValue(value = "two")
public class TwoWheel extends Vehicle
{
    private int modelno;
	private String modelname;
	private boolean abs;
	private int tyretype;
	private String btype;
	
}
