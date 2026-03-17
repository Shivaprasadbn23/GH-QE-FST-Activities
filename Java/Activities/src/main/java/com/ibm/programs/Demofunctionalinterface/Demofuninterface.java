package com.ibm.programs.Demofunctionalinterface;

public class Demofuninterface  {
    public static void main(String[] args) {

        // Lambda expression to implement the interface method
        FuncInterfaceExample obj = (String str) -> {
            return str.toLowerCase();
        };
        
        // Print statement calling the display method
        System.out.println(obj.display("SHIVU"));
    }
    
}
interface FuncInterfaceExample {
    String display(String str);
}

