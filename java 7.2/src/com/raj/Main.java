// Write a Java program to print all natural numbers in reverse (from n to 1). - using while loop
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter how many Natural Numbers in reverse do you want: ");
        int a = RAJ.nextInt();
        while (a>0)
        {
            System.out.println(a);
            a--;
        }
    }
}
