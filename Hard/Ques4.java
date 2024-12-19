package Hard;

class Book {
    String title;
    String author;
    int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Borrower {
    String name;
    int id;
    Book borrowedBook;

    public Borrower(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void borrowBook(Book book) {
        this.borrowedBook = book;
        System.out.println("Borrower " + name + " (ID: " + id + ") has borrowed \"" + book.title + "\" by " + book.author + " (ISBN: " + book.isbn + ").");
    }

    public void returnBook() {
        if (this.borrowedBook != null) {
            System.out.println("Borrower " + name + " (ID: " + id + ") has returned \"" + borrowedBook.title + "\" by " + borrowedBook.author + " (ISBN: " + borrowedBook.isbn + ").");
            this.borrowedBook = null;
        } else {
            System.out.println("No book to return.");
        }
    }
}

class Library {
    Book book;
    Borrower borrower;

    public Library(String title, String author, int isbn, String name, int id) {
        this.book = new Book(title, author, isbn);
        this.borrower = new Borrower(name, id);
    }

    public void performAction(int action) {
        if (action == 1) {
            borrower.borrowBook(book);
        } else if (action == 2) {
            borrower.returnBook();
        } else {
            System.out.println("Invalid action type.");
        }
    }

    public static void main(String[] args) {
        Library library = new Library("C++ Basics", "John Doe", 1234, "Alice", 42);
        library.performAction(1); // Borrow a book
        library.performAction(2); // Return a book
        library.performAction(3); // Invalid action
    }
}