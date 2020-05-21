
// ReferenceBook and GeneralBook derived from books
// ReferenceBook class extends BookClass
public class ReferenceBook extends Book {
    // ReferenceBook properties specific to ReferenceBook
    private String consulting, subject;
    private int version;
    // GeneralBook constructor inheriting all of the methods and properties of book
    public ReferenceBook(String ISBN, String genre, String author, String binding,
                         double rentCost, double retailPrice, int publishedYear,
                         String consulting, String subject, int version) {
        super(ISBN, genre, author, binding, rentCost, retailPrice, publishedYear);
        this.consulting = consulting;
        this.subject = subject;
        this.version = version;
    }

    // getter and setters
    public String getConsulting() {
        return consulting;
    }

    public void setConsulting(String consulting) {
        this.consulting = consulting;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    // Add toString Override
    @Override
    public String toString() {
        return "ReferenceBook{" +
                "consulting='" + consulting + '\'' +
                ", subject='" + subject + '\'' +
                ", version=" + version +
                '}';
    }
}

