import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String ISBN = scanner.nextLine();
                    library.addBook(new Book(title, author, ISBN));
                    break;
                case 2:
                    library.viewAllBooks();
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to issue: ");
                    ISBN = scanner.nextLine();
                    library.issueBook(ISBN);
                    break;
                case 4:
                    System.out.print("Enter ISBN of the book to return: ");
                    ISBN = scanner.nextLine();
                    library.returnBook(ISBN);
                    break;
                case 5:
                    System.out.print("Enter book title to search: ");
                    title = scanner.nextLine();
                    library.searchBook(title);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}

