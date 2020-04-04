package com.didem.hackerrank;

import javafx.beans.binding.DoubleExpression;

import java.io.*;
import java.math.*;
import java.security.*;
import java.sql.SQLOutput;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        Double zeroSum = 0.0, positiveSum = 0.0, negativeSum = 0.0;
        int zeroCount = 0, positiveCount = 0, negativeCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeroCount ++;
            }else if(arr[i] < 0){
                negativeCount ++;
            }else if(arr[i] > 0){
                positiveCount ++;
            }
        }
        zeroSum = (double)zeroCount/arr.length;
        positiveSum = (double) positiveCount/arr.length;
        negativeSum = (double) negativeCount/arr.length;

        System.out.println(positiveSum);
        System.out.println(negativeSum);
        System.out.println(zeroSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
