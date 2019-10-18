package com.exercise13oppstatic.app;
import com.exercise13oopstatic.model.Car;
public class CarApp 
{

	public static void main(String... args) 
	{
		Car heliosCar=new Car();
		Car alexCar=new Car();
		Car cristinasCar=new Car();
		Car urielsCar=new Car();
		Car arysCar=new Car();
		Car davidsCar=new Car();
		Car manuelsCar=new Car();
		Car aliciasCar=new Car();
		Car jonasCar=new Car();
		Car gallosCar=new Car();
		
		heliosCar.setSerialNumber("1");
		heliosCar.setNumberDoors(4);
		heliosCar.setBrand("Volvo");
		alexCar.setSerialNumber("2");
		alexCar.setNumberDoors(4);
		alexCar.setBrand("Volvo");
		cristinasCar.setSerialNumber("3");
		cristinasCar.setNumberDoors(4);
		cristinasCar.setBrand("Volvo");
		urielsCar.setSerialNumber("4");
		urielsCar.setNumberDoors(4);
		urielsCar.setBrand("Honda");
		arysCar.setSerialNumber("5");
		arysCar.setNumberDoors(4);
		arysCar.setBrand("Honda");
		davidsCar.setSerialNumber("6");
		davidsCar.setNumberDoors(4);
		davidsCar.setBrand("Honda");
		manuelsCar.setSerialNumber("7");
		manuelsCar.setNumberDoors(4);
		manuelsCar.setBrand("Honda");
		System.out.println(heliosCar.ToString());
		System.out.println(alexCar.ToString());
		System.out.println(cristinasCar.ToString());
		System.out.println(urielsCar.ToString());
		System.out.println(arysCar.ToString());
		System.out.println(davidsCar.ToString());
		System.out.println(manuelsCar.ToString());
		
		

	}

}
