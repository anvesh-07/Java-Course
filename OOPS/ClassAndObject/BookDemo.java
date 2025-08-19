package OOPS.ClassAndObject;

class Book {
  String title;
  String author;

  void showBook() {
    System.out.println("Book: " + title + " | Author: " + author);
  }
}

public class BookDemo {
  public static void main(String[] args) {
    Book b1 = new Book();
    b1.title = "Java Programming";
    b1.author = "James Gosling";

    Book b2 = new Book();
    b2.title = "Effective Java";
    b2.author = "Joshua Bloch";

    b1.showBook();
    b2.showBook();
  }
}

/*
 * Explanation:
 * 1) "Book" class has title and author as variables.
 * 2) "showBook()" method prints book details.
 * 3) Two independent objects (b1 and b2) are created with different values.
 */
