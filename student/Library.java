import java.util.ArrayList;
import java.util.List;

public class Library {

    ArrayList<Book> books = new ArrayList<Book>();

    // This method adds the given book to the array list of books
    public void addBook(Book book) {
        books.add(book);
    }

    // This method will check the array list. If it finds any book matching the title of the given book,
    // it will return the book. If it does not find the book, it will throw a BookException 
    // informing the user the book was not found. Include the book title in the message.
    // This method propagates handling the exception to its clients.
    public Book findBook(Book book) throws BookException {
        
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                return books.get(i);
            }
        }

        throw new BookException("Book was not found: " + book.getTitle());
    }
}
