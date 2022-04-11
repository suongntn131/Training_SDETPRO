package lession_12;

import java.util.*;

public class Lab12 {
    /**
     * The main purpose of this lab is to explore Comparable and Comparator interfaces.
     *
     * Model
     * Please create a standard class for Book with below class fields:
     *
     * ISBN
     * year
     * title
     * author
     * Controller
     * Please create one (or more) methods to sort a List for below fields (ASC or DESC)
     *
     * ISBN
     * year
     * title
     * author
     */
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("=======Menu=======");
            System.out.println("1. Input book");
            System.out.println("2. Sort list by ISBN");
            System.out.println("3. Sort list by year");
            System.out.println("4. Sort list by title");
            System.out.println("5. Sort list by author");
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
                    Collections.sort(bookList, new BookISBNComparator());
                    printSortedBooks(bookList);
                    break;
                case 3:
                    Collections.sort(bookList, new BookTitleComparator());
                    printSortedBooks(bookList);
                    break;
                case 4:
                    Collections.sort(bookList, new BookYearComparator());
                    printSortedBooks(bookList);
                    break;
                case 5:
                    Collections.sort(bookList, new BookAuthorNameComparator());
                    printSortedBooks(bookList);
                    break;
                default:
            }
        }

    }

    private static void printSortedBooks(List<Book> bookList){
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
