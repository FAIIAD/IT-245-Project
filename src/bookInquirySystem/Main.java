package bookInquirySystem;

public class Main {

    public static void main(String[] args) {
    	// Here, we created two empty versions for our search systems 
        BinarySearchTree bst = new BinarySearchTree();
        ArrayListInquirySystem arrayList = new ArrayListInquirySystem();

        // Creating a sample to demonstrate that the code can organize, search and retrieve
        Book b1 = new Book("111", "مقدمة ابن خلدون", "ابن خلدون");
        Book b2 = new Book("222", "حياة في الإدارة", "د.غازي القصيبي");
        Book b3 = new Book("333", "الأمير", "ميكيافيلي");
        
        // Inserting books in the BinarySearchTree
        bst.insert(b1);
        bst.insert(b2);
        bst.insert(b3);
        
        // Inserting books in the arrayList
        arrayList.insert(b1);
        arrayList.insert(b2);
        arrayList.insert(b3);
        
        //first scenario is trying to find a book that we know is exist 
        System.out.println("--- Basic Search Test ---");
        Book foundBook = bst.search("حياة في الإدارة");
        
        if (foundBook != null) {
            System.out.println("Success! We retrieved: " + foundBook.toString());
        } else {
            System.out.println("Sorry, book was not found.");
        }
        System.out.println("-------------------------");

        // below block of code is for performance test 
        System.out.println("Adding 100,000 books to test speed...");
        
        String targetTitle = ""; 
        // Pick a completely random position so the search target changes every time
        int randomPosition = (int) (Math.random() * 100000);
        // Created a loop that runs 100000 times
        for (int i = 0; i < 100000; i++) {
            int randomNum = (int) (Math.random() * 1000000);
            String randomTitle = "Book " + randomNum;
            // create a fake book as if we are searching for different random book every time 
            Book newBook = new Book("ISBN" + i, randomTitle, "Author " + i);
            
            // Added to both system to compare 
            arrayList.insert(newBook);
            bst.insert(newBook);
            
            // Save the randomly picked book to search for it later
            if (i == randomPosition) {
                targetTitle = randomTitle;
            }
        }

        System.out.println("We are going to search for: " + targetTitle);

        // Calculating time for the ArrayList
        long start1 = System.nanoTime();
        arrayList.search(targetTitle);
        long end1 = System.nanoTime();   
        long timeForList = end1 - start1; 

        // Calculating time for the Binary Search Tree
        long start2 = System.nanoTime(); 
        Book treeResult = bst.search(targetTitle); 
        long end2 = System.nanoTime();   
        long timeForTree = end2 - start2; 

        if (treeResult != null) {
            System.out.println("Retrieved from large list: " + treeResult.toString());
        }

        // Print final results
        System.out.println();
        System.out.println("ArrayList Search Time: " + timeForList + " nanoseconds");
        System.out.println("Binary Search Tree Time: " + timeForTree + " nanoseconds");
    }
}