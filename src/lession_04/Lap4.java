package lession_04;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lap4 {
    public static void main(String[] args) {
        /**
         * Lab 4: Create a simple menu with 4 options:
         * =====MENU======
         * 1. Add number into ArrayList
         * 2. Print numbers
         * 3. Get maximum number
         * 4. Get minimum number
         * Optional: Add option number 5 to find a number -> index
         */

        boolean isContinuing = true;
        List<Integer> arrList = new ArrayList<>();
        while (isContinuing){
            System.out.println("=====MENU======");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Find a number");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select option number: ");
            int numberInput = scanner.nextInt();
            switch (numberInput){
                case 0:
                    System.out.print("Goodbye!");
                    isContinuing = false;
                    break;
                case 1:
                    System.out.print("Please enter a number you want to add to the list: ");
                    numberInput = scanner.nextInt();
                    arrList.add(numberInput);
                    break;
                case 2:
                    if (arrList.size() > 0){
                        System.out.print("Your list: ");
                        for (Object value : arrList) {
                            System.out.print(value + "  ");
                        }
                        System.out.print("\n");
                    }else{
                        System.out.println("Don't have any number in your list.");
                    }
                    break;
                case 3:
                    if (arrList.size() > 0){
                        int max = arrList.get(0);
                        for (int i = 1; i < arrList.size(); i++) {
                            if (arrList.get(i) > max){
                                max = arrList.get(i);
                            }
                        }
                        System.out.println("Maximum: "+ max);
                    }else{
                        System.out.println("Don't have any number in your list.");
                    }
                    break;
                case 4:
                    if (arrList.size() > 0){
                        int min = arrList.get(0);
                        for (int i = 1; i < arrList.size(); i++) {
                            if (arrList.get(i) < min){
                                min = arrList.get(i);
                            }
                        }
                        System.out.println("Mininum: "+ min);
                    }else{
                        System.out.println("Don't have any number in your list.");
                    }
                    break;
                case 5:
                    if (arrList.size() > 0){
                        System.out.print("Enter the number you want to find: ");
                        numberInput = scanner.nextInt();
                        List<Integer> indexArr= new ArrayList<>();
                        for (int i = 0; i < arrList.size(); i++) {
                            if (arrList.get(i) == numberInput){
                                indexArr.add(i);
                            }
                        }
                        if (indexArr.size() > 0) {
                            System.out.print("Number " + numberInput + " at index ");
                            for (Integer value : indexArr) {
                                System.out.print(value + ", ");
                            }
                        }else {
                            System.out.println("This number is not found in the list ");
                        }
                    }else{
                        System.out.println("Don't have any number in your list.");
                    }
                    break;
                default:
            }

        }

    }
}
