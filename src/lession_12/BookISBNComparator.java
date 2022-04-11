package lession_12;

import java.util.Comparator;

public class BookISBNComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getISBN().compareToIgnoreCase(o2.getISBN());
    }
}
