package org.example;

import java.util.Scanner;

public class Main {
    public static int countTheHighestBirthdayCakeCandles(int[] candles) {

        int maxHeightOfCandles = 0;
        int numberOfTheHighestCandles = 0;

        for (int candle : candles) {

            if (candles[candle] > maxHeightOfCandles) {
                maxHeightOfCandles = candles[candle];

            }
        }
        for (int candle : candles) {
            if (candles[candle] == maxHeightOfCandles) {
                numberOfTheHighestCandles++;
            }
        }
        return numberOfTheHighestCandles;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of candles: ");
        int numberOfCandles = scanner.nextInt();

        int[] candles = new int[numberOfCandles];

        System.out.println("Enter the high of the candles");
        for (int i = 0; i < numberOfCandles; i++) {
            candles[i] = scanner.nextInt();
        }

        System.out.println(countTheHighestBirthdayCakeCandles(candles));

    }
}