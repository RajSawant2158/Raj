// Write a Java program to find first and last digit of a number.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 123;
        int first_digit,last_digit;
        first_digit = firstDigit(number);

        last_digit = lastDigit(number);

        System.out.println("\n The First Digit of a Given Number " + number + "  =  " + first_digit);
        System.out.println("\n The Last Digit of a Given Number " + number + "  =  " + last_digit);
    }

    public static int firstDigit(int num)
    {
        while(num >= 10)
        {
            num = num / 10;
        }
        return num;
    }

    public static int lastDigit(int num)
    {
        return num % 10;
    }
}
