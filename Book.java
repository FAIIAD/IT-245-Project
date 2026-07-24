package bookInquierySystemUsingBTS;

public class Book implements Comparable<Book> {
    String isbn;
    String title;
    String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book other) {
        return this.isbn.compareTo(other.isbn);
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author;
    }
}
