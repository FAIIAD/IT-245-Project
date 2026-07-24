package bookInquierySystemUsingBTS;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInquirySystem {
    private List<Book> books;

    public ArrayListInquirySystem() {
        this.books = new ArrayList<>();
    }

    // Method to insert a book into the ArrayList O(1)
    public void insert(Book book) {
        books.add(book);
    }

    // Method to search for a book using Linear Search O(n)
    public Book search(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                return book;
            }
        }
        return null; // Book not found
    }
}
