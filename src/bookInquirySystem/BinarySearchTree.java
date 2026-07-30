package bookInquirySystem;

public class BinarySearchTree {
	// root is the top node in BST.
    Node root;
    // At the beginning root is empty 
    public BinarySearchTree() {
        root = null;
    }

    // In this method, we call for Main and add a book 
    public void insert(Book book) {
        root = insertRec(root, book);
    }

    // This is recursive function used to find empty place in the tree 
    private Node insertRec(Node root, Book book) {
    	// once we find empty place, a node is created and book is saved in it. 
        if (root == null) {
            root = new Node(book);
            return root;
        }
        // here we use compareTo method to sort nodes alphabetically
        if (book.compareTo(root.book) < 0) {
            root.left = insertRec(root.left, book);
        } else if (book.compareTo(root.book) > 0) {
            root.right = insertRec(root.right, book);
        }

        return root;
    }

    // we took method from Main to find a book 
    public Book search(String searchTitle) {
        Node result = searchRec(root, searchTitle);
        if (result != null) {
        	// When book is found, it will be retrieved
            return result.book; 
        }
        // in case book is not found, return null
        return null;
    }
    // Here recursive method is used to search for a book 
    private Node searchRec(Node root, String searchTitle) {
    	// Terminate search once book is found or we reached the end of tree
        if (root == null || root.book.title.equals(searchTitle)) {
            return root;
        }
        // if title is before current node alphabetically, we check left side only
        if (searchTitle.compareTo(root.book.title) < 0) {
            return searchRec(root.left, searchTitle);
        }
        // if not, we check right side only
        return searchRec(root.right, searchTitle);
    }
}
