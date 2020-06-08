//class CardHolder reps someone who joined library and can check out items, reservedItems items, etc.

import java.util.List;
import java.util.Date;
import java.util.List;

// Cardholder class not derived from another class
public class CardHolder {
    // CardHolder properties
private String customerName, address;
private Date joinedOnDate;
private boolean checkedOutItems, reservedItems;

//    Create separate members in the CardHolder for a list of books, a list of periodicals,
//    and a list of multimedia items that are overdue.
private List<Book> overdueBooks;
private List<Periodical> overduePeriodicals;

    // CarHolder class constructor
    public CardHolder(String customerName, String address, Date joinedOnDate, boolean checkedOutItems,
                      boolean reservedItems, List<Book> overdueBooks, List<Periodical> overduePeriodicals) {
        this.customerName = customerName;
        this.address = address;
        this.joinedOnDate = joinedOnDate;
        this.checkedOutItems = checkedOutItems;
        this.reservedItems = reservedItems;
        this.overdueBooks = overdueBooks;
        this.overduePeriodicals = overduePeriodicals;
    }

    public CardHolder() {

    }


    // getter
    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public Date getJoinedOnDate() {
        return joinedOnDate;
    }

    public boolean isCheckedOutItems() {
        return checkedOutItems;
    }

    public boolean isReservedItems() {
        return reservedItems;
    }

    public List<Book> getOverdueBooks(String s) {
        return overdueBooks;
    }

    public List<Periodical> getOverduePeriodicals(String s) {
        return overduePeriodicals;
    }

    // setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJoinedOnDate(Date joinedOnDate) {
        this.joinedOnDate = joinedOnDate;
    }

    public void setCheckedOutItems(boolean checkedOutItems) {
        this.checkedOutItems = checkedOutItems;
    }

    public void setReservedItems(boolean reservedItems) {
        this.reservedItems = reservedItems;
    }

    public void setOverdueBooks(List<Book> overdueBooks) {
        this.overdueBooks = overdueBooks;
    }

    public void setOverduePeriodicals(List<Book> periodical1) {
        this.overduePeriodicals = overduePeriodicals;
    }


    public void addOverdueBooks(Book overdue) {
        overdueBooks.add(overdue);
    }

//    public void printOverdueBooks() {
//        getOverdueBooks();
//        overdueBooks.forEach(this::printOverdueBooks);
//    }

    public void addOverduePeriodical(Periodical p) {
        overduePeriodicals.add(p);
    }

    public void printOverduePeriodicals(Periodical overdue) {
//        getOverduePeriodicals(overdue);
        overduePeriodicals.forEach(this::printOverduePeriodicals);

    }

    // Add toString Override
    @Override
    public String toString() {
        return "CardHolder{" +
                "customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", joinedOnDate=" + joinedOnDate +
                ", checkedOutItems=" + checkedOutItems +
                ", reservedItems=" + reservedItems +
                ", overdueBooks=" + overdueBooks +
                ", overduePeriodicals=" + overduePeriodicals +
                '}';


    }

    public void setOverdueBooks() {
    }

//    public boolean printOverdueBooks() {
//        return printOverdueBooks();
//    }

    public void setOverdueBooks(String s) {
    }

//    public boolean printOverdueBooks() {
//    }
}
