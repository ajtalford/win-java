//class CardHolder reps someone who joined library and can check out items, reserve items, etc.

// Carholder class not derived from another class
public class CardHolder {
    // CardHolder properties
private String customer, address;
private boolean checkOut, reserve;

    // CarHolder class constructor
    public CardHolder(String customer, String address, boolean checkOut,
                      boolean reserve) {
        this.customer = customer;
        this.address = address;
        this.checkOut = checkOut;
        this.reserve = reserve;
    }

    // getters
    public String getCustomer() {
        return customer;
    }

    public String getAddress() {
        return address;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public boolean isReserve() {
        return reserve;
    }


    // setters
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    // Add toString Override
    @Override
    public String toString() {
        return "CardHolder{" +
                "customer='" + customer + '\'' +
                ", address='" + address + '\'' +
                ", checkOut=" + checkOut +
                ", reserve=" + reserve +
                '}';
    }
}
