package bookInquirySystem;

public class Node {
	//book will have actual book information 
    Book book;
    // Books with alphabetically smaller titles are stored in the left subtree.
Node left;

// Books with alphabetically greater titles are stored in the right subtree.
Node right;

    //this is a constructor used to store Book value inside the Node
    public Node(Book book) {
        this.book = book;
        this.left = null;
        this.right = null;
    }
}
