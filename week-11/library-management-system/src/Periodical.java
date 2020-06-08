//LibraryItem base class, two immediate derived classes are Book and Periodical.

// Periodical class extends LibraryItem
public class Periodical extends LibraryItem implements Reservable, Loanable {
    // Periodical properties specific to periodical
    private String topic;
    private boolean series;

    // With topics and series Periodical constructor inheriting all of the methods and properties of LibraryItem
    public Periodical(String ISBN, String genre, String author,
                      String binding, double rentCost, double retailPrice,
                      int publishedYear, String topic, boolean series) {
        super(ISBN, genre, author, binding, rentCost, retailPrice, publishedYear);
        this.topic = topic;
        this.series = series;
    }


    // getters and setters
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public boolean isSeries() {
        return series;
    }

    public void setSeries(boolean series) {
        this.series = series;
    }

    // Add toString Override
    @Override
    public String toString() {
        return "Periodical{" +
                "topic='" + topic + '\'' +
                ", series=" + series +
                '}';
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
