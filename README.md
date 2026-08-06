# IT245 Book Inquiry System

This project was developed for the IT245 Data Structures course by Group 11.

## Project Description

The Book Inquiry System is a Java program designed to organize, search, and retrieve books using their titles.

The project implements and compares two different data structure solutions:

1. ArrayList with Linear Search
2. Binary Search Tree

Each book contains:

- ISBN
- Title
- Author

## Implemented Solutions

### 1. ArrayList with Linear Search

Books are stored in an ArrayList.

The search method checks each book title one by one until it finds the matching title or reaches the end of the list.

### 2. Binary Search Tree

Books are stored in a custom Binary Search Tree and organized alphabetically by title.

Titles that come before the current title are stored in the left subtree, while titles that come after it are stored in the right subtree.

## Project Structure

- `Book.java`  
  Represents a book and stores its ISBN, title, and author.

- `Node.java`  
  Represents a node in the Binary Search Tree.

- `ArrayListInquirySystem.java`  
  Implements book insertion and Linear Search using an ArrayList.

- `BinarySearchTree.java`  
  Implements book insertion and searching using a Binary Search Tree.

- `Main.java`  
  Tests both solutions and compares their search performance.

## Testing

The Main class performs the following tests:

- Searching for an existing book using both solutions
- Searching for a book that does not exist
- Generating 100,000 sample books
- Measuring the search time using `System.nanoTime()`
- Displaying the retrieved book and execution time

## Time Complexity

### ArrayList

- Insertion at the end: Amortized `O(1)`
- Best-case search: `O(1)`
- Average and worst-case search: `O(n)`

### Binary Search Tree

- Average insertion and search: `O(log n)` when the tree is reasonably balanced
- Worst-case insertion and search: `O(n)` when the tree is unbalanced

## How to Run

1. Download or clone the repository.
2. Open the project in a Java IDE.
3. Make sure all Java files are inside the `bookInquirySystem` package.
4. Run `Main.java`.
5. View the search results and execution times in the console.

## Search Key

Books are searched using their titles.

## Group Members

- Sultan Abdullah Mohammed Sultan
- Fahad Mohammed Alzuabi
- Rawaf Salem Alghamdi
