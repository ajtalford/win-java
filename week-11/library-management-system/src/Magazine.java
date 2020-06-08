// Magazine and NewsPaper are Derived from Periodical


public class Magazine extends Periodical {
    // Magazine properties specific to magazine
    private String advertise;
    private String coverPersonality;
    // Magazine constructor inheriting methods and properties from Periodical
    public Magazine(String ISBN, String genre, String author, String binding, double rentCost,
                    double retailPrice, int publishedYear,
                    String topic, boolean series, String advertise, String coverPersonality) {
        super(ISBN, genre, author, binding, rentCost, retailPrice, publishedYear, topic, series);
        this.advertise = advertise;
        this.coverPersonality = coverPersonality;
    }


    public String getAdvertise() {
        return advertise;
    }

    public void setAdvertise(String advertise) {
        this.advertise = advertise;
    }

    public String getCoverPersonality() {
        return coverPersonality;
    }

    public void setCoverPersonality(String coverPersonality) {
        this.coverPersonality = coverPersonality;
    }

    // Add toString Override
    @Override
    public String toString() {
        return "Magazine{" +
                "advertise='" + advertise + '\'' +
                ", coverPersonality='" + coverPersonality + '\'' +
                '}';
    }
}
