// Write a Java program to input electricity unit charges and calculate total electricity bill according to the given condition:
//For first 50 units Rs. 0.50/unit
//For next 100 units Rs. 0.75/unit
//For next 100 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill
package com.raj;

import  java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the units to Get Bill: ");
        double units = RAJ.nextDouble();


        if(units<=50)
        {
            System.out.println("Your Total Bill is Rs: "+units*0.50);
        }
        else
            if(units>=50 && units<=150)
        {
            System.out.println("Your Total Bill is Rs: "+(25+(units - 50)*0.75));
        }
            else if(units>=150&&units<=250)
            {
                System.out.println("Your Total Bill is Rs: "+(100+(units-150)*1.20));
            }
            else
            {
                System.out.println("Your Total Bill is Rs: "+(220+(units-250)*1.50));
            }
    }
}
