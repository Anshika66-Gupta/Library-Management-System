import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>(); // Made final

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void viewBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
