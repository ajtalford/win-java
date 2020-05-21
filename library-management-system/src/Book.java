

// LibraryItem base class, two immediate derived classes are Book and Periodical.
public class Book extends LibraryItem {

    public Book(String ISBN, String genre, String author, String binding, double rentCost,
                double retailPrice, int publishedYear) {
        super(ISBN, genre, author, binding, rentCost, retailPrice, publishedYear);
    }



}
