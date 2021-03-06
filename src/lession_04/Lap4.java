package lession_04;

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
            int optionInput = scanner.nextInt();
            switch (optionInput){
                case 0:
                    System.out.print("Goodbye!");
                    isContinuing = false;
                    break;
                case 1:
                    System.out.print("Please enter a number you want to add to the list: ");
                    optionInput = scanner.nextInt();
                    arrList.add(optionInput);
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
                        optionInput = scanner.nextInt();
                        List<Integer> indexList= new ArrayList<>();
                        for (int i = 0; i < arrList.size(); i++) {
                            if (arrList.get(i) == optionInput){
                                indexList.add(i);
                            }
                        }
                        if (indexList.size() > 0) {
                            System.out.print("Number " + optionInput + " at index ");
                            for (Integer value : indexList) {
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
