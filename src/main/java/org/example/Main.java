package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BirthdayCake birthdayCake = new BirthdayCake();

        int n;

        System.out.println("Enter the number of candles: ");
        n = scanner.nextInt() ;

        int candles[] = new int[n];

        System.out.println("Enter the high of the candles");
        for (int i = 0; i<n;i++){
            candles[i] = scanner.nextInt();
        }

        System.out.println(birthdayCake.birthdayCakeCandles(candles));

    }
}