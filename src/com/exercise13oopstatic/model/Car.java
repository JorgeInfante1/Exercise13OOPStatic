package com.exercise13oopstatic.model;

public class Car 
{
	private String serialNumber;
	private int numberDoors;
	private boolean isCoupe=false;
	private String brand;
	
	public Car()
	{	
	}
	
	public Car(String serialNumbers, int numberDoors)
	{
		this.serialNumber=serialNumbers;
		this.numberDoors=numberDoors;
	}

	
	public String getSerialNumber()
	{
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber=serialNumber;
	}
	public int getNumberDoors()
	{
		return numberDoors;
	}
	public void setNumberDoors(int numberDoors)
	{
		this.numberDoors=numberDoors;
	}
	
	public void CarIsCoupe(boolean isCoupe)
	{
		this.isCoupe = isCoupe;
		if(this.isCoupe)
		{
			this.numberDoors=2;			
		}
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String ToString()
	{
		return "serial number: "+this.serialNumber+", number doors: "+numberDoors;
	}
}
