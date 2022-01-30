// Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the marks of\n Physics \n Chemistry \n Biology \n Mathematics \n Computer");
        int a = RAJ.nextInt();
        int b = RAJ.nextInt();
        int c = RAJ.nextInt();
        int d = RAJ.nextInt();
        int e = RAJ.nextInt();
        System.out.println("Enter the Total Marks of Examination: ");
        int f = RAJ.nextInt();
        int total = a + b + c + d + e;
        int avg = a + b + c + d + e / 5;
        double percentage = (total * 100) / f;
        System.out.println("Total marks you obtained are: " + total + " out of " + f);

        System.out.println("Average marks are: " + avg);

        System.out.println("Percentage you got are: " + percentage + " %");
        if (percentage >= 90 )
        {
            System.out.println("Grade A");
        }
        else
        {
            if(percentage >= 80 )
            {
                System.out.println("Grade B");
            }
            else
            {
                if(percentage >= 70)
                {
                    System.out.println("Grade C");
                }
                else
                {
                    if(percentage >= 60)
                    {
                        System.out.println("Grade D");
                    }
                    else
                    {
                        if(percentage >= 40)
                        {
                            System.out.println("Grade E");
                        }
                        else
                        {
                            if(percentage <= 40)
                            {
                                System.out.println("Grade F");
                            }
                        }
                    }
                }
            }
        }

    }
}