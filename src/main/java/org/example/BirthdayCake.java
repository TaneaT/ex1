package org.example;
public class BirthdayCake {

    public int birthdayCakeCandles(int[] candles){

        int max = 0;
        int count = 0;

        for(int i=0; i<candles.length;i++) {

        if (candles[i] > max){
            max = candles[i];

        }}
        for(int j=0; j<candles.length;j++) {
        if (candles[j] == max){
                count++;
                }
            }
        return count;
    }
}
