// Write a Java program to print all ASCII character with their values.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i=0;
        while(i<=255)
        {
            System.out.println("Ascci value of "+(char)i+" is " +i);
            i++;
        }
    }
}
