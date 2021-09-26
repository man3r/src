package com.greatlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Stockers {

    public static void main(String[] args) {

        public Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of companies");
        int compCount = sc.nextInt();
        int[] stockPrices = new int[compCount];
        int[] spChange = new int[compCount];

        for (int i = 0; i < compCount; i++) {
            System.out.println("Enter current stock price of the company " + i);
            stockPrices[i] = sc.nextInt();
            System.out.println("Whether company's stock price rose today compare to yesterday (true/false)?");
            spChange[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(stockPrices));
        System.out.println(Arrays.toString(spChange));

    }

}
