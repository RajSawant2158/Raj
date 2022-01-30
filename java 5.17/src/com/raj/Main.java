// Write a Java program to find all roots of a quadratic equation.
package com.raj;

import  java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Write an values of Quadratic Equation");
        double a = RAJ.nextInt();
        double b = RAJ.nextInt();
        double c = RAJ.nextInt();
        double d = (b*b)-(4*a*c);
        double root1,root2;
        double imaginary;

        if(d>0)
        {
            root1=(-b + Math.sqrt(d)/(2*a));
            root2=(-b + Math.sqrt(d)/(2*a));
            System.out.println("Two distinct real roots exist "+root1+" "+root2);
        }
        else
        {
            if(d==0)
            {
                root1 = root2 = -b / (2 * a);
                System.out.println("Two equal and real roots exist "+root1+" "+root2);
            }
            else
            {
                if(d<0)
                {
                    root1 = root2 = -b / (2 * a);
                    imaginary = Math.sqrt(-d) / (2 * a);
                    System.out.println("Two distinct complex roots exist "+root1+imaginary+" " +root2+imaginary);
                }
            }
        }
    }
}
