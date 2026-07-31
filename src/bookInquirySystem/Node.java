package bookInquirySystem;

public class Node {
	//book will have actual book information 
    Book book;
    //Nodes are like pointers. it will sort items according to book title.
    // book will be stored in left node if title starting with a letter smaller than current node. 
    Node left;
    // book will be stored in right node if title starting with a letter larger than current node. 
    Node right;

    //this is a constructor used to store Book value inside the Node
    public Node(Book book) {
        this.book = book;
        this.left = null;
        this.right = null;
    }
}
