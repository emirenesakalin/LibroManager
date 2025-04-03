public class Textbook extends ReadingMaterial {
    private final String subject; // The subject of the textbook
    private final String academicLevel; // The academic level for which the textbook is intended

    // Constructor to initialize the textbook's attributes
    public Textbook(String title, int numberOfPages, String publisher, String subject, String academicLevel) {
        super(title, numberOfPages, publisher);
        this.subject = subject;
        this.academicLevel = academicLevel;
    }

    // Provides a description of the textbook
    @Override
    public void describeMaterial() {
        System.out.println("This is a textbook for subject: " + subject + ", Academic Level: " + academicLevel);
    }

    // Returns a string representation of the textbook
    @Override
    public String toString() {
        return "Textbook [Title: " + title + ", Subject: " + subject + ", Academic Level: " + academicLevel + ", Pages: " + numberOfPages + ", Publisher: " + publisher + "]";
    }
}