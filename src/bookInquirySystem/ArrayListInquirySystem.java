package bookInquirySystem;

import java.util.ArrayList;

public class ArrayListInquirySystem {
	// Created listed to hold Book objects 
    ArrayList<Book> books;
    // This sets the arraylist to empty 
    public ArrayListInquirySystem() {
        books = new ArrayList<>();
    }
    // This inserts a book to the end of the arraylist 
    public void insert(Book book) {
        books.add(book);
    }

    // This is for linear search method 
    public Book search(String searchTitle) {
    	// We use for loop to go through every single element in the list resulting in O(n) Time complexity  
        for (int i = 0; i < books.size(); i++) {
        	// This will show the result when found
            if (books.get(i).title.equals(searchTitle)) {
                return books.get(i); // Retrieve the book
            }
        }
        // If book is not in the list
        return null; 
    }
}
