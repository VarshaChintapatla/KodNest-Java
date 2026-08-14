import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        // Store the title and author
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class P04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the book title and author
        // Create one Book object
        Book b = new Book(sc.nextLine(), sc.nextLine());

        // Call display()
        b.display();

        sc.close();
    }
}