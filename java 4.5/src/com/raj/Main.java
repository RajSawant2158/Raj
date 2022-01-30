// Write a Java program to check whether character is an alphabet or not using conditional operator.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.print("enter any character: ");
        char ch = RAJ.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
        System.out.print(ch+" is an Alphabet");
        else
        System.out.print(ch+" is not an Alphabet");


    }
}
