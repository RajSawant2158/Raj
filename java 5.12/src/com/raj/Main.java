// Write a Java program to input month number and print number of days in that month.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the number of Month: ");
        int a = RAJ.nextInt();
        if(a== 1|| a==3|| a==5|| a==7|| a==8|| a==10|| a==12)
        {
            System.out.println("31 days in Entered Month..");
        }
        else
        {
            if(a==4|| a==6|| a==9|| a==11)
            {
                System.out.println("30 days in Entered Month..");
            }
            else
            {
                System.out.println("28 days in Entered Month..");
            }
        }

    }
}
