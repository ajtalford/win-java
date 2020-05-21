// ReferenceBook and GeneralBook derived from books
//GeneralBook class extending Book class
public class GeneralBook extends Book {
    // GeneralBook constructor inheriting all of the methods and properties of book
    public GeneralBook(String ISBN, String genre, String author, String binding, double rentCost,
                       double retailPrice, int publishedYear) {
        super(ISBN, genre, author, binding, rentCost, retailPrice, publishedYear);
    }
}
