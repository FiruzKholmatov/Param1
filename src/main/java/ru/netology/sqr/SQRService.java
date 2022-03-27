package ru.netology.sqr;

public class SQRService {
    public int countCalc(int min, int max) {
        int counter = 0;
        int num;
        for (int i = 10; i < 99; i++) {
            num = i * i;
            if ((num > min) && (num < max)) {
                counter++;
            }
        }
        return counter;
    }
}
