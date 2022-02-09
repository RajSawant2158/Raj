// 	Write a Java program to find power of a number using for loop.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int Number = 10;
        int Power = 3 ;
        int Result = 1;
        int i;
        for(i = 1; i <= Power; i++)
        {
            Result = Result * Number;
        }

        System.out.println(Result);

    }
}
