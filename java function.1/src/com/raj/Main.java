// calculator use int,char,float and complex number as input and operate addition,subtraction,division,multiplication
package com.raj;

import java.util.*;

public class Main {


            public double Add(double First, double Second) {
                return First + Second;
            }

            public double Sub(double First, double Second) {
                return First - Second;
            }

            public double Multi(double First, double Second) {
                return First * Second;
            }
            public double Div(double First, double Second) {
                return First / Second;
            }
            public int Char(char ch) {
                return ch;
            }
            public double Complex(double a, double b, double i) {
                return a + b * i;
            }

            public static void main(String[] args) {
                Scanner RAJ = new Scanner(System.in);
                Main obj = new Main();

                System.out.print("Do you want to operate on Numbers or Characters or Complex Numbers : ");
                String Declaration = RAJ.next();

                if(Objects.equals(Declaration, "Numbers")) {

                    System.out.print("Enter First Number : ");
                    double First = RAJ.nextDouble();

                    System.out.print("Enter Second Number : ");
                    double Second = RAJ.nextDouble();

                    System.out.print("what you want to do with these numbers : ");
                    String Operator = RAJ.next();
                    if (Objects.equals(Operator, "+")) {
                        System.out.println("Addition = " + obj.Add(First, Second));
                    } else if (Objects.equals(Operator, "-")) {
                        System.out.println("Subtraction = " + obj.Sub(First, Second));
                    } else if (Objects.equals(Operator, "*")) {
                        System.out.println("Multiplication = " + obj.Multi(First, Second));
                    } else if (Objects.equals(Operator, "/")) {
                        System.out.println("Division = " + obj.Div(First, Second));
                    }
                }
                else
                    if(Objects.equals(Declaration,"Characters"))
                    {
                            System.out.println("Enter the Alphabet to get Ascii Value: ");
                            char ch = RAJ.next().charAt(0);
                            if(ch >= 'A')
                            {
                                System.out.println("Ascii value of "+ch+ " is " +obj.Char(ch));
                            }
                    }
                    else
                        if(Objects.equals(Declaration,"Complex"))
                        {
                            System.out.println("Enter a: ");
                            double a = RAJ.nextDouble();

                            System.out.println("Enter b: ");
                            double b = RAJ.nextDouble();

                            System.out.println("Enter i: ");
                            double i = RAJ.nextDouble();

                            System.out.println("Solution of Equation is " +obj.Complex(a, b, i));
                        }

            }
        }



