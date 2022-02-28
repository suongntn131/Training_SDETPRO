package lession_03;

import java.lang.reflect.Array;

public class Lap31 {
    /**
     * Count how many odd, even number(s) in an integer array
     *
     * int[] intArr = {1, 2, 3, 4, 5};
     *
     * Even numders: 2
     * Odd numbers: 3
     */
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]%2 == 0){
                ++evenNumbers;
            }else {
                ++oddNumbers;
            }
        }
        System.out.println("Even numbers: " + evenNumbers + "\n" + "Odd number: " + oddNumbers);
    }
}
