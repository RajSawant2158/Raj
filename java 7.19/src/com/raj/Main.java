// Write a Java program to enter a number and print it in words.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = RAJ.nextInt();
        int thou,hun,tens,ones,zero,elevens;

                    if (n==0) {

                        switch (n){
                            case 0: System.out.println("Zero");break;

                        }
                    }

                    if ((n>=100) && (n<=10000)){

                        thou = n/1000;
                        n = n%1000;
                        hun = n/100;
                        n = n%100;

                        switch(thou){

                            case 1:System.out.print("One Thousand ");break;
                            case 2:System.out.print("Two Thousand ");break;
                            case 3:System.out.print("Three Thousand ");break;
                            case 4:System.out.print("Four Thousand ");break;
                            case 5:System.out.print("Five Thousand ");break;
                            case 6:System.out.print("Six Thousand ");break;
                            case 7:System.out.print("Seven Thousand ");break;
                            case 8:System.out.print("Eight Thousand ");break;
                            case 9:System.out.print("Nine Thousand ");break;
                            case 10:System.out.print("Ten Thousand ");break;
                        }


                        switch (hun) {
                            case 1:System.out.print("One Hundred ");break;
                            case 2:System.out.print("Two Hundred ");break;
                            case 3:System.out.print("Three Hundred ");break;
                            case 4:System.out.print	("Four Hundred ");break;
                            case 5:System.out.print ("Five Hundred ");break;
                            case 6:System.out.print	("Six Hundred ");break;
                            case 7:System.out.print("Seven Hundred ");break;
                            case 8:System.out.print	("Eight Hundred ");break;
                            case 9:System.out.print	("Nine Hundred ");break;


                        }
                    }


                    if ((n>10) && (n<20)){

                        tens = n / 10;
                        ones = n;
                        elevens = n % 10;


                        switch (elevens){
                            case 1:System.out.print("Eleven ");break;
                            case 2:System.out.print("Twelve ");break;
                            case 3:System.out.print("Thirteen ");break;
                            case 4:System.out.print	("Fourteen ");break;
                            case 5:System.out.print ("Fifteen ");break;
                            case 6:System.out.print	("Sixteen ");break;
                            case 7:System.out.print("Seventeen ");break;
                            case 8:System.out.print	("Eighteen ");break;
                            case 9:System.out.print	("Nineteen ");break;
                        }
                    }
                    if (n>3000){
                        System.out.print("INVALID INPUT");
                    }

                    else {
                        tens = n/10;
                        n = n%10;
                        ones = n;

                        switch (tens) {

                            case 1: System.out.print("Ten ");break;
                            case 2:System.out.print("Twenty ");break;
                            case 3:System.out.print("Thirty ");break;

                            case 4:System.out.print("Fourty ");break;
                            case 5:System.out.print("Fifty ");break;
                            case 6:System.out.print("Sixty ");break;
                            case 7:System.out.print("Seventy ");break;
                            case 8:System.out.print("Eighty ");break;
                            case 9:	System.out.print("Ninety ");break;
                        }
                        switch (ones){

                            case 1: System.out.print("One ");break;
                            case 2:System.out.print("Two ");break;
                            case 3:System.out.print("Three ");break;

                            case 4:System.out.print("Four ");break;
                            case 5:System.out.print("Five ");break;
                            case 6:System.out.print("Six ");break;
                            case 7:System.out.print("Seven ");break;
                            case 8:System.out.print("Eight ");break;
                            case 9:System.out.print("Nine ");break;

                        }

                    }

                }
            }

