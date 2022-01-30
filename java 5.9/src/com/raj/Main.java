// Write a Java program to input any character and check whether it is alphabet, digit or special character.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = RAJ.next().charAt(0);

        if((ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z'))
        {
            System.out.println(ch+" is alphabet ");
        }
        else
        {
            if(ch>='0'&&ch<='9')
            {
                System.out.println(ch+ " is Number ");
            }
            else
            {
                System.out.println(ch+" is Special Character ");
            }
        }

    }
}
