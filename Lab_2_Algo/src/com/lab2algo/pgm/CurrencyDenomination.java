package com.lab2algo.pgm;

import java.util.*;

public class CurrencyDenomination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of currency denominations: ");
        int n = sc.nextInt();
        int[] currency = new int[n];
        System.out.print("Enter the currency denominations value: ");
        for (int i = 0; i < n; i++) {
            currency[i] = sc.nextInt();
        }
        System.out.print("Enter the amount you want to pay: ");
        int amount = sc.nextInt();
        Arrays.sort(currency);
        int count = 0;
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = n - 1; i >= 0; i--) {
            if (currency[i] <= amount) {
                int notes = amount / currency[i];
                count += notes;
                amount -= notes * currency[i];
                System.out.println(currency[i] + ":" + notes);
            }
        }
        if (amount > 0) {
            System.out.println("Remaining amount: " + amount);
        }
        System.out.println("Total number of notes used: " + count);
        sc.close();
    }
}
