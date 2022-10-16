package ru.netology.javaqa.javamvn.hwsqr;

public class SQRServiceRange {

    public int countSqrt(int low, int high){
        int count = 0;

        for (int i = 10; i < 100; i++) {

            if (i * i < low) continue;
            if (i * i > high) break;

            count++;
        }
        return count;
    }

}
