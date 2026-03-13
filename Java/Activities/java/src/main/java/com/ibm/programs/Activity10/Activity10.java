package com.ibm.programs.Activity10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args) {
        Set<String> hp=new HashSet<>();
        hp.add("A");
        hp.add("B");
        hp.add("C");
        hp.add("D");
        hp.add("E");
        System.out.println(hp.size());
        hp.remove("A");
        if(hp.remove("Z")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
        System.out.println(hp.contains("A"));
        for(String s:hp){
            System.out.println(s);
        }

    }
}
