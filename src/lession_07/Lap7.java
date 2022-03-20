package lession_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lap7 {
    public static void main(String[] args) {
        /**\
         * Create a simple menu
         * 1. Input book
         * 2. Find book by ISBN
         * 0. Exit!
         * Book object
         * String ISBN
         * String title
         * String authorName
         * String/int year
         * Please override toString method to print out the found book.
         * If there is no matched book, please print out book not found
         */

        List<Book> bookList = new ArrayList<>();
        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("=======Menu=======");
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("0. Exit!");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select option number: ");
            int optionInput = Integer.parseInt(scanner.nextLine());

            switch (optionInput){
                case 0:
                    System.out.print("Goodbye!");
                    isContinuing = false;
                    break;
                case 1:
                    System.out.print("Please enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Please enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Please enter author name: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Please enter publishing year: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    Book book = new Book(ISBN, title, authorName, year);
                    bookList.add(book);
                    break;
                case 2:
                    System.out.print("Please enter ISBN to find the book: ");
                    String ISBNInput = scanner.nextLine();
                    boolean isFound = false;
                    for (int i = 0; i < bookList.size(); i++) {
                        if (bookList.get(i).getISBN().equals(ISBNInput)){
                            System.out.println(bookList.get(i));
                            isFound = true;
                        }
                    }
                    if (!isFound){
                        System.out.println("This book is not exist.");
                    }
                    break;
                default:
            }
        }

    }
}
