package lession_03;

public class Lap32 {
    public static void main(String[] args) {
        /**
         * Finding maximum value/minimum value from an integer array
         *
         * int[] intArr = {1, 2, 3, 4, 5};
         *
         * Minimum: 1
         * Maximum: 5
         */
        int[] intArr = {1, 2, 3, 4, 5};
        int max = intArr[0];
        int min = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] < min){
                min = intArr[i];
            }else if (intArr[i] > max){
                max = intArr[i];
            }
        }
        System.out.println("Minimum = " + min + "\n" + "Maximum: " + max);
    }
}
