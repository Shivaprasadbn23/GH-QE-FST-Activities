package com.ibm.programs.Activity1;


    public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car(){
        tyres=4;
        doors=4;
    }

    public void displayCharacterstics(){
	System.out.println("Car color is: " + color);
	System.out.println("Make of the Car: " + make);
	System.out.println("Transmission of the Car: " + transmission);
	System.out.println("Number of doors in car: " + tyres);
    }

    public void accelerate() {
	System.out.println("Car is moving forward direction");
    }
	
    public void brake() {
	System.out.println("Car has stopped");
    }
}

