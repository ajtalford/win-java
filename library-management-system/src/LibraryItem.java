//LibraryItem base class, two immediate derived classes are Book and Periodical.
// ReferenceBook and GeneralBook are derived from Book
// Magazine and NewsPaper are Derived from Periodical
public class LibraryItem {

    // Class properties private, so add getters/setters
    private String ISBN, genre, author, binding;
    private double rentCost, retailPrice;
    private int publishedYear;

    // Our constructor with all properties given
    public LibraryItem(String ISBN, String genre, String author, String binding,
                       double rentCost, double retailPrice, int publishedYear) {
        this.ISBN = ISBN;
        this.genre = genre;
        this.author = author;
        this.binding = binding;
        this.rentCost = rentCost;
        this.retailPrice = retailPrice;
        this.publishedYear = publishedYear;
    }

    public LibraryItem() {

    }

    // Getters
    public String getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getBinding() {
        return binding;
    }

    public double getRentCost() {
        return rentCost;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public int getPublishedYear() {
        return publishedYear;
    }


    // Setters
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}

