package lession_12;

public class Book {
    private String ISBN;
    private String title;
    private String authorName;
    private int year;

    public Book(String ISBN, String title, String authorName, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorName = authorName;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year=" + year +
                '}';
    }
}
