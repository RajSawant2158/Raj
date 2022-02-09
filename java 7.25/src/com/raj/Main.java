// Write a Java program to find LCM of two numbers.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the First number");
        int Num1 = RAJ.nextInt();
        System.out.println("Enter the Second number");
        int Num2 = RAJ.nextInt();
        int a=Num1 ;
        int b=Num2;
        int GCD=0,LCM=0;
        while(Num2 != 0)
        {
            if(Num1 > Num2)
            {
                Num1 = Num1 - Num2;
            }
            else
            {
                Num2 = Num2 - Num1;
            }
        }
        GCD = Num1;
        System.out.println("\n GCD of " + a + " and " + b + "  =  " + GCD);

        LCM = (a * b) / GCD;
        System.out.println("\n LCM of " + a + " and " + b + "  =  " + LCM);
    }
}
