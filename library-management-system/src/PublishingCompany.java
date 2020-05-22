//Relationships
//Create classes for Author and PublishingCompany. Code in relationships into each of the library items.
//How will you handle that an item can have multiple authors?


public class PublishingCompany {

    private String publisher;

    public PublishingCompany(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    @Override
    public String toString() {
        return "PublishingCompany{" +
                "publisher='" + publisher + '\'' +
                '}';
    }
}
