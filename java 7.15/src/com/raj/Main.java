// Write a Java program to calculate product of digits of a number.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 1234;
        int rem;
        int product = 1;
        while(i>0)
        {
            rem = i%10;
            product = product*rem;
            i = i/10;
        }
        System.out.println("product "+product);
    }
}
