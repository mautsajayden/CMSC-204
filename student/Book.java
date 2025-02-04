public class Book {
    private String title;
    private String author;
    private int pages;
    private int stock;

    //update the constructor so that if title is missing or pages are not more than 1, 
    //the constructor throws an InvalidBookException informing the user about the issue.
    //this constructor propagates handling the exception to its clients 
    public Book(String title, String author, int pages, int stock)  {        
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.stock = stock;
        
       
        if(this.title.isEmpty() || this.pages > 1 || title.isEmpty() ) {
        	throw new InvalidBookException("InvalidBookException informing the user about the issue.");
        }
          	     
    }

    //implement the method so that if the given book is in stock, it will decrement the number of available books
    //and if it is not it will throw an OutOfStockException exception informing the user the book is out of stock
    //Make sure to include book title in the message
    //this method propagates handling the exception to its clients 
    public void borrowBook() throws OutOfStockException  {
    	if(stock <= 0) {
    		throw new OutOfStockException("book is out of stock" + title);
    	}
    	stock--;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}