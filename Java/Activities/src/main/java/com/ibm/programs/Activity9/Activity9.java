package com.ibm.programs.Activity9;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
   public static void main(String[] args) {
     List<String> myList=new ArrayList<>();
    myList.add("Apple");
    myList.add("Mango");
    myList.add("Orange");
    myList.add("grapes");
    myList.add("papaya");
    System.out.println("print all the names ");
    for(String s:myList){
        System.out.println(s);
    }
    System.out.println(myList.get(3));
    System.out.println(myList.contains("Mango"));
    System.out.println(myList.size());
    myList.remove("papaya");
    System.out.println(myList.size());
   }
}
