package com.lseg.arrays;

import java.util.Arrays;

public class Rotleft_homeworkv2 {
    public static void main(String[] args) {

        int[] sir = new int[]{2, 4, 6, -8, -10, 12, -14};
        int rotation = 3;

        shiftLeft(sir, rotation);

        System.out.println(Arrays.toString(sir));


    }

    private static void shiftLeft(int[] sir, int d) {
        for (int iterationNumber = 1; iterationNumber <= d; iterationNumber++) {
            int temp = sir[0];

            for (int index = 0; index <= sir.length - 2; index++) {
                sir[index] = sir[index + 1];
            }

            sir[sir.length - 1] = temp;
        }
    }
}