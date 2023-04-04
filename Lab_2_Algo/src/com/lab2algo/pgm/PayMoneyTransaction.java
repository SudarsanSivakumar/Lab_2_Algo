package com.lab2algo.pgm;

import java.util.Scanner;

public class PayMoneyTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of transaction array:");
        int n = sc.nextInt();
        int[] transactions = new int[n];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }
        System.out.println("Enter the total number of targets that need to be achieved:");
        int numTargets = sc.nextInt();
        for (int i = 0; i < numTargets; i++) {
            System.out.println("Enter the value of target:");
            int target = sc.nextInt();
            int sum = 0;
            int j = 0;
            while (sum < target && j < n) {
                sum += transactions[j];
                j++;
            }
            if (sum >= target) {
                System.out.println("Target achieved after " + j + " transactions");
            } else {
                System.out.println("Target is not achievable");
            }
        }
        sc.close();
    }
}
