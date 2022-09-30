package com.hadiuz.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity 
@PrimaryKeyJoinColumn(name ="vid")
public class TwoWheel extends Vehicle
{
    private int modelno;
	private String modelname;
	private boolean abs;
	private int tyretype;
	private String btype;
	
}
