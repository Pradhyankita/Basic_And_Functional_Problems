package com.bridgelabz.basic;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("SWAPPING WITH TEMPORARY VARIABLE");
        int t = 0;
        System.out.print("enter a= ");
        int a = scanner.nextInt();
        System.out.print("enter b= ");
        int b = scanner.nextInt();
        t = a;
        a = b;
        b = t;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("SWAPPING WITHOUT TEMPORARY VARIABLE");
        System.out.print("enter x=");
        int x=scanner.nextInt();
        System.out.print("enter y=");
        int y=scanner.nextInt();
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);

    }
}
