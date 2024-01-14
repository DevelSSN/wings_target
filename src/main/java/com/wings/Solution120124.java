package com.wings;

import java.io.*;
import java.util.*;

    


public class Solution120124 {
    public static int birthday(ArrayList<Integer> s, int d, int m) {
    // Write your code here
        int sum, j, count=0;
            for (int i = 0; i <= s.size()-m; i++) {
                sum=0;
                j=0;
                for ( j = i; j!=m+i ; j++) {
                    sum+=s.get(i+j);
                }
                if(sum==d)
                    count++;
            }

        return count;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> s=new ArrayList<Integer>();
        System.out.println("Input n");
        int n=sc.nextInt();
        System.out.println("Input List");
        for (int i = 0; i < n; i++) {
            int q=sc.nextInt();
            s.add(q);
        }
        System.out.println("Input d:");
        int d=sc.nextInt();
        System.out.println("Input m:");
        int m=sc.nextInt();
        int result=birthday(s,d,m);
        System.out.println(result);
        sc.close();
    }
}
