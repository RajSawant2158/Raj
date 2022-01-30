// Write a Java program to input any alphabet and check whether it is vowel or consonant.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter Alphabet: ");
        char ch = RAJ.next().charAt(0);

        if (ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u'|ch=='A'|ch=='E'|ch=='I'|ch=='O'|ch=='U')
        {
            System.out.println(ch+" is vovel");
        }
        else
        {
            System.out.println(ch+" is consonant");
        }

    }
}
