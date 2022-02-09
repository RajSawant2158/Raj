// Write a Java program to check whether a number is Strong number or not.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int Number = RAJ.nextInt();
        int Temp = Number;
        int Factorial,i,Reminder,Sum=0;
        while( Temp > 0)
        {
            Factorial = 1;
            i = 1;
            Reminder = Temp % 10;
            while (i <= Reminder)
            {
                Factorial = Factorial * i;
                i++;
            }
            System.out.println(" The Factorial of " + Reminder + "  =  " + Factorial);
            Sum = Sum + Factorial;
            Temp = Temp /10;
        }

        System.out.println(" The Sum of the Factorials of a Given Number " + Number + " =  " + Sum);
        if(Sum == Number)
        {
            System.out.println(" The Given Number is Strong ");
        }
        else
        {
            System.out.println(" The Given Number is Not Strong ");
        }

    }
}
