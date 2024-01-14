package com.wings;

import java.util.Scanner;

public class Solution140124 {

        /*
         * Complete the right 'staircase' function below.
         *
         * The function accepts INTEGER n as parameter.
         */
    
        public static void staircase(int n) {
        // Write your code here
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if(j<=n-i)
                     System.out.print(" ");
                    else
                     System.out.print("#");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter n:");
            int n=sc.nextInt();
            staircase(n);
            sc.close();
        }
    }
