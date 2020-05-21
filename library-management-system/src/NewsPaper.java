// Magazine and NewsPaper are Derived from Periodical


import java.util.Date;

public class NewsPaper extends Periodical {
    // property for date printed
    private Date printed;

    public NewsPaper(String ISBN, String genre, String author, String binding, double rentCost,
                     double retailPrice, int publishedYear, String topic,
                     boolean series, Date printed) {
        super(ISBN, genre, author, binding, rentCost, retailPrice, publishedYear, topic, series);
        this.printed = printed;
    }

    public Date getPrinted() {
        return printed;
    }

    // getter and setter for printed date
    public void setPrinted(Date printed) {
        this.printed = printed;
    }

}
