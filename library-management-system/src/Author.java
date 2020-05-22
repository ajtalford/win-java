//Relationships
//Create classes for Author and PublishingCompany. Code in relationships into each of the library items.
//How will you handle that an item can have multiple authors?

public class Author {
    // Author properties
    private String authorName, expertise;


    // Author constructor
    public Author(String authorName, String lastName, String expertise) {
        this.authorName = authorName;
        this.expertise = expertise;
    }


    // getters
    public String getauthorName() {
        return authorName;
    }


    public String getExpertise() {
        return expertise;
    }


    // setters
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    // override toString method
    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", expertise='" + expertise + '\'' +
                '}';
    }
}
