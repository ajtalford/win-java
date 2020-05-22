//class CardHolder reps someone who joined library and can check out items, reservedItems items, etc.

import java.util.ArrayList;
import java.util.Date;

// Carholder class not derived from another class
public class CardHolder {
    // CardHolder properties
private String customerName, address;
    private ArrayList<LibraryItem> checkedOutItems;
    private ArrayList<LibraryItem> reservedItems;
    private Date joinedOnDate;
//private boolean checkedOutItems, reservedItems;

    // CarHolder class constructor
    public CardHolder(String customerName, String address, ArrayList<LibraryItem> checkedOutItems,
                      ArrayList<LibraryItem> reservedItems, Date joinedOnDate) {
        this.customerName = customerName;
        this.address = address;
        this.checkedOutItems = checkedOutItems;
        this.reservedItems = reservedItems;
        this.joinedOnDate = joinedOnDate;
    }

    // getter
    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<LibraryItem> getCheckedOutItems() {
        return checkedOutItems;
    }

    public ArrayList<LibraryItem> getReservedItems() {
        return reservedItems;
    }

    public Date getJoinedOnDate() {
        return joinedOnDate;
    }


    // setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCheckedOutItems(ArrayList<LibraryItem> checkedOutItems) {
        this.checkedOutItems = checkedOutItems;
    }

    public void setReservedItems(ArrayList<LibraryItem> reservedItems) {
        this.reservedItems = reservedItems;
    }

    public void setJoinedOnDate(Date joinedOnDate) {
        this.joinedOnDate = joinedOnDate;
    }


    // Add toString Override
    @Override
    public String toString() {
        return "CardHolder{" +
                "customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", checkedOutItems=" + checkedOutItems +
                ", reservedItems=" + reservedItems +
                ", joinedOnDate=" + joinedOnDate +
                '}';
    }
}
