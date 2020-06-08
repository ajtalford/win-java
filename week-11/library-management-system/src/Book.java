// Derived from LibraryItem are Book and Periodical classes

// Book class extends Library class
public class Book extends LibraryItem implements Reservable, Loanable{
    // Book constructor inheriting all of the methods and properties of LibraryItem
    public Book(String ISBN, String genre, String author, String binding, double rentCost,
                double retailPrice, int publishedYear) {
        super(ISBN, genre, author, binding, rentCost, retailPrice, publishedYear);
    }

    public Book() {

    }




    //Some items may be reservable, and some may be loanable. Create an interface for each of these
    //and implement them in classes which fit the appropriate type
    @Override
    public boolean isLoanable() {
        return false;
    }

    @Override
    public int getLoanTerm() {
        return 0;
    }

    @Override
    public int getMaxLoanPeriod() {
        return 0;
    }

    @Override
    public float getLoanablePenalty() {
        return 0;
    }

    @Override
    public void isLoanable(boolean b) {

    }

    @Override
    public int getPersonHold() {
        return 0;
    }

    @Override
    public int getClassHold() {
        return 0;
    }

    @Override
    public int getMaxReservableItems() {
        return 0;
    }
}
