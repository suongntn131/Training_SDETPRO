package lession_03;

import javax.sound.midi.Soundbank;

public class Lap33 {
    public static void main(String[] args) {
        /**
         * Sort an integer array from min to max
         *
         * Input: {12, 34, 1, 16, 28}
         * Expected output: {1, 12, 16, 28, 34}
         */
        int[] intArr = {12, 34, 1, 16, 28};
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                if (intArr[i] > intArr [j]){
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
        }
        for (int element : intArr) {
            System.out.println(element);
        }
    }
}
