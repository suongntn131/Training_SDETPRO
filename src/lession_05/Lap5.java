package lession_05;

import java.util.*;

public class Lap5 {
    public static void main(String[] args) {
        /**
         * Allow user to input student name and id
         * Find by using ID
         * Create a simple menu
         * 1. Input student info
         * 2. Find Student by ID
         * 0. Exit!
         */
        Map<Integer, String> studentList = new HashMap<>();
        boolean isContinuing = true;

        while (isContinuing){
            System.out.println("=======Menu=======");
            System.out.println("1. Input student info");
            System.out.println("2. Find Student by ID");
            System.out.println("0. Exit!");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select option number: ");
            int optionInput = Integer.parseInt(scanner.nextLine());

            switch (optionInput){
                case 0:

                    break;
                case 1:
                    boolean isDuplicate = false;
                    while (!isDuplicate){
                        System.out.print("Please enter student name: ");
                        String studentName = scanner.nextLine();
                        System.out.print("Please enter student ID: ");
                        int studentID = Integer.parseInt(scanner.nextLine());
                        if (studentList.get(studentID) == null){
                            studentList.put(studentID,studentName);
                            isDuplicate = true;
                        } else {
                            System.out.println("This ID already exists, please enter again!");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Please enter student ID to find: ");
                    int studentID = Integer.parseInt(scanner.nextLine());
                    if (studentList.get(studentID) != null){
                        System.out.println("Student name: " + studentList.get(studentID));
                    } else {
                        System.out.println("This ID is not exist!");
                    }
                    break;
                default:
            }
        }
    }
}
