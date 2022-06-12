package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                temp++;
                if (temp>2){
                    break;
                }
            }
        }
        if (temp == 2) {
            System.out.println("Given number is a PrimeNumber");
        }
        else {
            System.out.println("Given number is not a PrimeNumber");
        }
    }
}
