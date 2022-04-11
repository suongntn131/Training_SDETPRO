package lession_12;

import java.util.Comparator;

public class BookAuthorNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthorName().compareToIgnoreCase(o2.getAuthorName());
    }
}
