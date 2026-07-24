package bookInquierySystemUsingBTS;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Public method to insert a new book
    public void insert(Book book) {
        root = insertRec(root, book);
    }

    // Recursive helper method for insertion
    private Node insertRec(Node root, Book book) {
        if (root == null) {
            root = new Node(book);
            return root;
        }

        // Uses your compareTo method. < 0 means smaller ISBN goes left.
        if (book.compareTo(root.book) < 0) {
            root.left = insertRec(root.left, book);
        } else if (book.compareTo(root.book) > 0) {
            root.right = insertRec(root.right, book);
        }

        return root;
    }

    // Public method to search for a book by its ISBN
    public Book search(String isbn) {
        Node result = searchRec(root, isbn);
        if (result != null) {
            return result.book;
        }
        return null;
    }

    // Recursive helper method for searching
    private Node searchRec(Node root, String isbn) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.book.isbn.equals(isbn)) {
            return root;
        }

        // Value is greater than root's key
        if (isbn.compareTo(root.book.isbn) < 0) {
            return searchRec(root.left, isbn);
        }

        // Value is less than root's key
        return searchRec(root.right, isbn);
    }
}
