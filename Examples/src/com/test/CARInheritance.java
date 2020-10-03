package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CARInheritance {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int carType = Integer.parseInt(bufferedReader.readLine().trim());
		int carMileage = Integer.parseInt(bufferedReader.readLine().trim());

		if (carType == 0) {
			Car wagonR = new WagonR(carMileage);
			wagonR.printCar("WagonR");
		}

		if (carType == 1) {
			Car hondaCity = new HondaCity(carMileage);
			hondaCity.printCar("HondaCity");
		}

		if (carType == 2) {
			Car innovaCrysta = new InnovaCrysta(carMileage);
			innovaCrysta.printCar("InnovaCrysta");
		}
	}

}

abstract class Car {

	int milage;
	private boolean isSedan;
	private String seats;

	public Boolean getIsSedan() {

		return isSedan;

	}

	public String getSeats() {

		return seats;

	}

	void printCar(String s) {

		System.out.println(s);
	}

	abstract String getMileage();

}

class WagonR extends Car {

	WagonR(int milage) {
		this.milage = milage;
	}

	@Override
	String getMileage() {
		// TODO Auto-generated method stub
		return "18";
	}
}

class HondaCity extends Car {

	HondaCity(int milage) {
		this.milage = milage;
	}

	@Override
	String getMileage() {
		// TODO Auto-generated method stub
		return "12";
	}

}

class InnovaCrysta extends Car {

	InnovaCrysta(int milage) {
		this.milage = milage;
	}

	@Override
	String getMileage() {
		// TODO Auto-generated method stub
		return "8";
	}

	
}
