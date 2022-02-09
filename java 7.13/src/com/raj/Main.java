// Write a Java program to swap first and last digits of a number.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 1234;
        int n=0;
        int num2=num;

        while(num2>0)
        {
            num2 /= 10;
            n++;
        }
        int first_digit = num/(int)Math.pow(10,n-1);
        int last_digit = num%10;
        num = (num%(int )Math.pow(10,n-1)) + (last_digit* (int)Math.pow(10,n-1));
        num = num/10;
        num = num*10+first_digit;
        System.out.println("swapped no: "+num);
    }
}
