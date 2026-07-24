package bookInquierySystemUsingBTS;

public class Main {
    public static void main(String[] args) {
        // 1. Create the Tree
        BinarySearchTree bst = new BinarySearchTree();

        // 2. Create some books
        Book book1 = new Book("55555", "Data Structures", "Alice");
        Book book2 = new Book("22222", "Java Fundamentals", "John Doe");
        Book book3 = new Book("88888", "Advanced Java", "Jane Smith");

        // 3. Insert books into the tree
        bst.insert(book1);
        bst.insert(book2);
        bst.insert(book3);

        // 4. Test the inquiry (search) system
        String targetIsbn = "88888";
        Book foundBook = bst.search(targetIsbn);

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.toString());
        } else {
            System.out.println("Book with ISBN " + targetIsbn + " not found.");
        }
    }
}
