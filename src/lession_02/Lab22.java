package lession_02;

import java.util.Scanner;

public class Lab22 {
    public static void main(String[] args) {
        /**
         *
         * Allow user to input a number, print out it’s an odd or even number
         */
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        num = scanner.nextInt();
        if (num%2 == 1) {
            System.out.println("This is an odd number");
        } else {
            System.out.println("This is an even number");
        }
    }
}
