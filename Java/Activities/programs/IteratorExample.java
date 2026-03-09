package com.ibm.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> listStrings = new ArrayList<String>();

        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");

        Iterator<String> iterator = listStrings.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}