package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter Days : ");
        int days = RAJ.nextInt();
        int years = days / 365;
        days = days - (365 * years);
        int months = days / 30;
        int d = days - (months * 30);

        System.out.println(years + " Years " + months + " Months " + d + " Days");

    }
}
