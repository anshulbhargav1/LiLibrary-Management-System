import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void issueBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book issued successfully: " + book.getTitle());
                } else {
                    System.out.println("Sorry, the book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }

    public void returnBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully: " + book.getTitle());
                } else {
                    System.out.println("This book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }

    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with the title: " + title);
        }
    }
}

