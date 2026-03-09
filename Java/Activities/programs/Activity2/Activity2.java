package com.ibm.programs.Activity2;

public class Activity2 {
    public static void main(String[] sp){
        int[] arr={10, 77, 10, 54, -11, 10,10};
        int findvalue=30;
        System.out.println("Result is:"+Sum(arr,findvalue));
    }

    private static boolean Sum(int[] arr, int findvalue) {
       int sum=0;
        for( int n:arr){
            if(n==10){
                sum+=n;
            }
        }
        return sum==findvalue;
}
}
