// Write a Java program to calculate sum of digits of a number.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 123;
        int sum = 0;
        int rem;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
}
