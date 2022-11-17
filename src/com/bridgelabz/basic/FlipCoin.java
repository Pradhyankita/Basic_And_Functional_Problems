package com.bridgelabz.basic;
import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int count = 1;
        double randomNumber = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of flips ");
        int flips = sc.nextInt();

        while(count <= flips){
            randomNumber = Math.random();
            System.out.println(count + " " +randomNumber);
            if(randomNumber < 0.5){
                heads ++;
                System.out.println("Heads");
            }
            else{
                tails++;
                System.out.println("Tails");
            }
            count++;
        }
        System.out.println();
        System.out.println("Number of Heads: " +heads);
        System.out.println("Number of Tails: " +tails);

        double headpercent = (double) heads/flips*100;
        double tailpercent = (double) tails/flips*100;

        System.out.println("Percentage of Heads is " +headpercent);
        System.out.println("Percentage of Tails is " +tailpercent);

    }

}

