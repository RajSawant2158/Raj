package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("\n Enter the Number:");
        int x = RAJ.nextInt();
        System.out.println("\n Enter the Power of Number:");
        int y = RAJ.nextInt();
        int z = 1;

        while (y > 0)
        {

            z = z * x;
            y--;

        }
        System.out.println(z);

    }
}
