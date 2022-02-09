// Write a Java program to find HCF (GCD) of two numbers.
package com.raj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int Num1, Num2, i, GCD = 0;
        Scanner RAJ  = new Scanner(System.in);

        System.out.print(" Enter the First Value : ");
        Num1 = RAJ.nextInt();

        System.out.print(" Enter the Second Value : ");
        Num2 = RAJ.nextInt();

        for(i = 1; i <= Num1 && i <= Num2; i++)
        {
            if(Num1 % i == 0 && Num2 % i == 0)
            {
                GCD = i;
            }
        }
        System.out.println("\n GCD of " + Num1 + " and " + Num2 + "  =  " + GCD);
    }
}