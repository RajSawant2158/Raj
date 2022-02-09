// 	Write a Java program to calculate factorial of a number.

package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


                Scanner RAJ= new Scanner(System.in);
                System.out.print("Enter n : = ");
                int a = RAJ.nextInt();
        int fact=1,i;

        for(i=1;i<=a;i++)
        {
            fact = fact * i;

        } System.out.println(fact);

            }
        }

