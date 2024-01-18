package com.wings_cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Solution180124 {

/*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        HashMap<Integer,Integer> freqCountHashMap=new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            freqCountHashMap.put(i, 0);
        }
        int lowestID=5, freq=0, max=0;
        /*
         * Iterate through every element in arr,
         * then update the freq of the same in hashMap
         * Check if freq of arr[i]>max freq till then
         * If true update max freq. and check for lowest ID. If false continue
         */
        for (Integer iD : arr) {
            freq=freqCountHashMap.get(iD);
            freqCountHashMap.put(iD, ++freq);
            if(freq>max){
                max=freq;
                lowestID=iD;
            }
            if(freq==max){
                lowestID=(iD<lowestID)?iD:lowestID;
            }
        }

        return lowestID;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input list:");
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        System.out.println(migratoryBirds(arr));
        sc.close();
    }
}