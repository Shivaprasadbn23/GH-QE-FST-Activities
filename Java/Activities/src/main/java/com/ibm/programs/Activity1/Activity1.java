package com.ibm.programs.Activity1;

public class Activity1 {

    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = 2003;
        toyota.color = "Red";
        toyota.transmission = "Automated";
    
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }

}
