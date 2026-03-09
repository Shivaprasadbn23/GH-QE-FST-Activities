package com.ibm.programs.Avtivity5;

public class Activity5 {
    public static void main(String[] args) {
        String title="My_Memories";
        MyBook sp=new MyBook();
        sp.setTitle(title);
        System.out.print(sp.getTitle());
    }
}
abstract class Book {
    String title;
    abstract void setTitle(String s);
    public String getTitle(){
        return title;
    }
}
    class MyBook extends Book {
        void setTitle(String s){
            title=s;
        }
        
    }
