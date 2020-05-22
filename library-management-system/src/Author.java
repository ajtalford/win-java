//Relationships
//Create classes for Author and PublishingCompany. Code in relationships into each of the library items.
//How will you handle that an item can have multiple authors?

public class Author {
    // Author properties
    private String firstName, lastName, expertise;


    // Author constructor
    public Author(String firstName, String lastName, String expertise) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expertise = expertise;
    }


    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getExpertise() {
        return expertise;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    // override toString method
    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", expertise='" + expertise + '\'' +
                '}';
    }
}
