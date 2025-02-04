
/*
 * Create at least four books
 * make sure you have a situation that a can is found, a book can be borrowed successfully, 
 * and a situation of each exception
 */
import java.util.ArrayList;

public class LibraryManager {
    
    public LibraryManager() {
    	Book book1 = new Book("1984",  "George Orwell", 328,12);
    	Book book2 = new Book( "To Kill a Mockingbird","Harper Lee", 0,  8);
    	Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", 310, 15);
    	Book book4 = new Book("Dune", "Frank Herbert", 1,  20);
    }
}
