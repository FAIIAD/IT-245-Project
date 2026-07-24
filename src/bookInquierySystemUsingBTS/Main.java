package bookInquirySystemUsingBTS;

public class Main {

    public static void main(String[] args) {

        // Create the two inquiry systems
        BinarySearchTree bstSystem = new BinarySearchTree();
        ArrayListInquirySystem arrayListSystem = new ArrayListInquirySystem();

        // Create sample books
        Book book1 = new Book("55555", "Data Structures", "Alice");
        Book book2 = new Book("22222", "Java Fundamentals", "John Doe");
        Book book3 = new Book("88888", "Advanced Java", "Jane Smith");

        // Insert books into the Binary Search Tree
        bstSystem.insert(book1);
        bstSystem.insert(book2);
        bstSystem.insert(book3);

        // Insert the same books into the ArrayList
        arrayListSystem.insert(book1);
        arrayListSystem.insert(book2);
        arrayListSystem.insert(book3);

        // Test 1: Search for an existing book
        String existingIsbn = "88888";

        System.out.println("Searching for ISBN: " + existingIsbn);

        Book bstFoundBook = bstSystem.search(existingIsbn);
        Book arrayListFoundBook = arrayListSystem.search(existingIsbn);

        if (bstFoundBook != null) {
            System.out.println("BST result: Book found: " + bstFoundBook);
        } else {
            System.out.println("BST result: Book not found.");
        }

        if (arrayListFoundBook != null) {
            System.out.println("ArrayList result: Book found: " + arrayListFoundBook);
        } else {
            System.out.println("ArrayList result: Book not found.");
        }

        System.out.println();

        // Test 2: Search for a book that does not exist
        String missingIsbn = "99999";

        System.out.println("Searching for ISBN: " + missingIsbn);

        Book bstMissingBook = bstSystem.search(missingIsbn);
        Book arrayListMissingBook = arrayListSystem.search(missingIsbn);

        if (bstMissingBook != null) {
            System.out.println("BST result: Book found: " + bstMissingBook);
        } else {
            System.out.println("BST result: Book not found.");
        }

        if (arrayListMissingBook != null) {
            System.out.println("ArrayList result: Book found: " + arrayListMissingBook);
        } else {
            System.out.println("ArrayList result: Book not found.");
        }
    }
}
