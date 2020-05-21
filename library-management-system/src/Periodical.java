//LibraryItem base class, two immediate derived classes are Book and Periodical.

// Periodical class extends LibraryItem
public class Periodical extends LibraryItem {
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
}
