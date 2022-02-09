// Write a Java program to check whether a number is palindrome or not.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 123212;
        int x=i;
        int rev = 0;
        int rem;

        while(i>0)
        {
            rem = i%10;
            rev = rev*10+rem;
            i = i/10;
        }
        System.out.println(rev);

        if(x==rev) {
            System.out.println("palindrone");
        }else
        {
            System.out.println("Not palindrone");
        }

    }
}
