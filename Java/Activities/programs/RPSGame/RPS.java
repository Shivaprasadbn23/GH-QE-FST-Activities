package com.ibm.programs.RPSGame;

import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner Mee=new Scanner(System.in);
        Random Rand=new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        try{
        System.out.println("Enter (0-Rock),(1-Papre),(2-Scissors)");
        int userchoice=Mee.nextInt();
        if(userchoice<0||userchoice>2){
            System.out.println("invalid choice Entered");
            return;
        }
        int computerChoice = Rand.nextInt(3);
        System.out.println("Enter the computer choice"+computerChoice);
        if(userchoice==computerChoice){
            System.out.println("Match draw!!!!");

        }else if((userchoice==0 && computerChoice==2)||
        (userchoice==1 && computerChoice==0)||
        (userchoice==2 && computerChoice==1)){
            System.out.println("You win!!!!");
        }else{
            System.out.println("Computer Wins!!!!");
        }
        }catch(Exception e){
            System.out.println("Invalid input enter valid inputs");
        }
    }
}
