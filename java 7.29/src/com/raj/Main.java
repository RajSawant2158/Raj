// Write a Java program to find all prime factors of a number.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("enter the last number: ");
        int a = RAJ.nextInt();
        int prime_Number;
        int n;
        int x;

        for(n=1;n<=a;n++) {
            x = 0;
            for(prime_Number = 2;prime_Number <= n / 2; prime_Number++) {
                if (n % prime_Number == 0) {
                    x++;
                    break;
                }
            }
            if (x == 0 && n != 1) {
                if(a%n==0) {
                    System.out.print(n + " ");
                }
            }

        }
    }
}
