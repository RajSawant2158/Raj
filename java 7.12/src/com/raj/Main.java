// Write a Java program to find sum of first and last digit of a number.
// Write a Java program to find first and last digit of a number.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = RAJ.nextInt();
        int first_digit,last_digit;
        first_digit = firstDigit(number);

        last_digit = lastDigit(number);

        System.out.println("\n The First Digit of a Given Number " + number + "  =  " + first_digit);
        System.out.println("\n The Last Digit of a Given Number " + number + "  =  " + last_digit);
        System.out.println("\n The sum ifLast Digit and first digit of a Given Number " + number + "  =  " + (last_digit+first_digit));
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
