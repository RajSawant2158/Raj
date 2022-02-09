// Write a Java program to enter a number and print its reverse.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i= 123;
        int rem;
        int rev=0;
        while(i>0)
        {
            rem = i%10;
            rev = rev*10+rem;
            i = i/10;
        }
        System.out.println(rev);
    }
}
