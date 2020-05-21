// Derived from LibraryItem are Book and Periodical classes

// Book class extends Library class
public class Book extends LibraryItem {
    // Book constructor inheriting all of the methods and properties of LibraryItem
    public Book(String ISBN, String genre, String author, String binding, double rentCost,
                double retailPrice, int publishedYear) {
        super(ISBN, genre, author, binding, rentCost, retailPrice, publishedYear);
    }

}
