package com.bridgelabz;

import java.util.Scanner;

public class RiverseNumber {
    public static void main(String[] args) {
        System.out .println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int rev =0;
        int rem;
        while( num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10 ;
        }
        System.out.println(rev);
    }
}
