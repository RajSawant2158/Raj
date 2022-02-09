// Write a Java program to print all even numbers between 1 to 100. - using while loop
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i=0;

        while(i<=100)
        {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
