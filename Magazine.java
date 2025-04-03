public class Magazine extends ReadingMaterial {
    private final int issueNumber; // The issue number of the magazine
    private final String publicationDate; // The publication date of the magazine

    // Constructor to initialize the magazine's attributes
    public Magazine(String title, int numberOfPages, String publisher, int issueNumber, String publicationDate) {
        super(title, numberOfPages, publisher);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    // Provides a description of the magazine
    @Override
    public void describeMaterial() {
        System.out.println("This is a magazine. Issue Number: " + issueNumber + ", Published on: " + publicationDate);
    }

    // Returns a string representation of the magazine
    @Override
    public String toString() {
        return "Magazine [Title: " + title + ", Issue Number: " + issueNumber + ", Publication Date: " + publicationDate + ", Pages: " + numberOfPages + ", Publisher: " + publisher + "]";
    }
}