package org.example;

public class EX6 {

    public float average(int number) {
        float count = (float) countDigits(number);
        float sum = (float) sumDigits(number);

        return sum /count;
    }

    public int countDigits(int number) {
        int counter = 0;

        while(number != 0) {
            number = number / 10;
            counter++;
        }

        return counter;
    }

    public int sumDigits(int number) {
        int sum = 0;

        while(number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        return sum;
    }
}
