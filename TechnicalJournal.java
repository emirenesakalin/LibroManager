public class TechnicalJournal extends ReadingMaterial {
    private final String scope; // The focus or subject area of the journal
    private final double impactFactor; // The impact factor of the journal
    private final int volumeNumber; // The volume number of the journal
    private final int issueNumber; // The issue number within the volume
    private final int year; // The publication year of the journal

    // Constructor to initialize the technical journal's attributes
    public TechnicalJournal(String title, int numberOfPages, String publisher, String scope, double impactFactor, int volumeNumber, int issueNumber, int year) {
        super(title, numberOfPages, publisher);
        this.scope = scope;
        this.impactFactor = impactFactor;
        this.volumeNumber = volumeNumber;
        this.issueNumber = issueNumber;
        this.year = year;
    }

    // Provides a description of the technical journal
    @Override
    public void describeMaterial() {
        System.out.println("This is a technical journal with scope: " + scope);
        System.out.println("Impact Factor: " + impactFactor + ", Volume: " + volumeNumber + ", Issue: " + issueNumber + ", Year: " + year);
    }

    // Returns a string representation of the technical journal
    @Override
    public String toString() {
        return "TechnicalJournal [Title: " + title + ", Scope: " + scope + ", Impact Factor: " + impactFactor + ", Volume: " + volumeNumber + ", Issue: " + issueNumber + ", Year: " + year + ", Pages: " + numberOfPages + ", Publisher: " + publisher + "]";
    }
}