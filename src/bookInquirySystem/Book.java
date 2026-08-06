package bookInquirySystem;
// Comparable method is used in order to conduct BinarySearchTree 
public class Book implements Comparable<Book> {
	//Book attributes 
    String isbn;
    String title;
    String author;
//This is Constructor used to build books when given information 
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    //This is used to decide if book goes to right node or left node based on alphabetical order
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    // Print statement shown on console
    @Override
    public String toString() {
        return "Title: '" + title + "', Author: '" + author + "'" + "ISBN: "+isbn;
    }
}
