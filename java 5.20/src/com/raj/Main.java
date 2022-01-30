// Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
//Basic Salary <= 10000 : HRA = 20%, DA = 80%
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
//Basic Salary > 20000 : HRA = 30%, DA = 95%
package com.raj;

import  java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter Your Basic Salary");
        double BS = RAJ.nextInt();
        double HRA,DA;
        if(BS <= 10000)
        {
            HRA = (BS*20)/100;
            DA = (BS*80)/100;
        }
        else
        {
            if(BS <= 20000)
            {
                HRA = (BS*25)/100;
                DA = (BS*90)/100;
            }
            else
            {
                HRA = (BS*30)/100;
                DA = (BS*95)/100;
            }
        }
        double Graoss_Salary = BS+HRA+DA;
        System.out.println(" the Gross Salary is "+Graoss_Salary);
    }
}
