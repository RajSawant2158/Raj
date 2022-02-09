// Write a Java program to check whether a number is Prime number or not.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = RAJ.nextInt();
        int count=0,i;
        for (i = 2; i <= number/2; i++)
        {
            if(number % i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0 && number != 1 )
        {
            System.out.println( number + " is a Prime Number");
        }
        else
        {
            System.out.println(number + " is Not a Prime Number");
        }
    }
}
