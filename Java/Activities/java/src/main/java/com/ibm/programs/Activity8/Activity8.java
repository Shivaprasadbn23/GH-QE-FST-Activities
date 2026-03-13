package com.ibm.programs.Activity8;

public class Activity8 {
    public static void main(String[] args) {
        try{
            Activity8.exceptionTest("hi ,welcome to IBM");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("QA fullstack tester");
            Activity8.exceptionTest(null);
        }catch(Exception e){
            System.out.println("output is :"+e.getMessage());
        }
    }

    private static void exceptionTest(String value) throws CustomException{
        if(value==null){
            System.out.println("null pointer exception");
        }else{
            System.out.println(value);
        }
    }
}
class CustomException extends  Exception {
     private String message=null;
    public CustomException(String message){
        this.message=message;
    }
    public String getMessage() {
        return message;
}
}