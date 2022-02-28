package lession_03;

import java.sql.Array;

public class Lap34 {
    public static void main(String[] args) {
        /**
         * Merge 2 SORTED integer array into one SORTED array
         *
         * Array 01: {1, 12, 16, 28, 34}
         * Array 02: {1, 13, 16, 27, 99}
         *
         * Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
         */
        int[] intArr01 = {1, 12, 16, 28, 34};
        int[] intArr02 = {1, 13, 16, 27, 99};
        int[] intArr03 = new int[intArr01.length + intArr02.length];
        int indexArr02 = 0;
        for (int i = 0; i < intArr01.length; i++) {
            intArr03[i] = intArr01[i];
        }
        for (int i = intArr01.length; i < intArr03.length; i++) {
            intArr03[i] = intArr02[indexArr02];
            ++indexArr02;
        }
        for (int i = 0; i < intArr03.length - 1; i++) {
            for (int j = i+1; j < intArr03.length; j++) {
                if (intArr03[i] > intArr03 [j]){
                    int temp = intArr03[j];
                    intArr03[j] = intArr03[i];
                    intArr03[i] = temp;
                }
            }
        }
        for (int element : intArr03) {
            System.out.print(element + "; ");
        }

    }
}
