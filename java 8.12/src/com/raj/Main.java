// Write a C program to print all unique elements in the array.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size, i;

        Scanner RAJ = new Scanner(System.in);
        System.out.print("\n Please Enter the Unique Array size :");
        size = RAJ.nextInt();

        int[] org_arr = new int[size];
        int[] unqArr = new int[size];

        System.out.format("\nEnter Unique Arrays %d Items : ", size);
        for(i = 0; i < size; i++) {
            org_arr[i] = RAJ.nextInt();
            unqArr[i] = -1;
        }
        UniqueArrayElement(org_arr, unqArr, size);
    }
    public static void UniqueArrayElement(int[] org_arr, int[] unqArr, int size) {
        int i, j, count;
        for(i = 0; i < size; i++) {
            count = 1;
            for(j = i + 1; j < size; j++) {
                if(org_arr[i] == org_arr[j]) {
                    count++;
                    unqArr[j] = 0;
                }
            }
            if(unqArr[i] != 0) {
                unqArr[i] = count;
            }
        }
        System.out.println("\nList of Unique Items in this Array :");
        for(i = 0; i < size; i++) {
            if(unqArr[i] == 1) {
                System.out.format("%d  ", org_arr[i]);
            }
        }
    }
}
