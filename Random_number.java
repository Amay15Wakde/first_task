package Internship;

import java.util.*;
public class Random_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Give me the limit of numbers to guess from 0 to -  ");
        int upper_limit = sc.nextInt();
        Random random = new Random();
        int x = random.nextInt(upper_limit);

        System.out.println("Start guessing the number , you only have 10 chances :");
        int n = 10;

        while(n>0)
        {
            int z = sc.nextInt();

            if(z==x){
                System.out.println("Congractulations ! your guess is correct , enter 1 for play again anf 0 for stop here");
                int option = sc.nextInt();
                if(option==1){
                    n = 10;
                    System.out.print ("Give me the limit of numbers to guess from 0 to -  ");
                    upper_limit = sc.nextInt();
//                    Random random = new Random();
                     x = random.nextInt(upper_limit);
                    System.out.println("Start guessing the number , you only have 10 chances :");
                }
                else{
                    System.out.println("Game Stop");
                    System.exit(0);}
            }
            else if(z<x){
                if(z-x==-1)
                    System.out.println("Increase your guess , you are so close");
                else
                System.out.println("Increase your guess");}
            else if(z>x){
                if(z-x==1)
                    System.out.println("Decrease your guess , you are so close");
                else
                System.out.println("Decrease your guess");}
            n--;
        }
        System.out.println("Sorry! Better Luck Next Time  , You are ran out of chance");
    }
}
