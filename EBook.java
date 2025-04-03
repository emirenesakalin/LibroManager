public class EBook extends Book {
    private final String fileFormat; // The file format of the eBook

    // Constructor to initialize the eBook's attributes
    public EBook(String title, int numberOfPages, String publisher, String author, String[] primaryCharacters, String fileFormat) {
        super(title, numberOfPages, publisher, author, primaryCharacters);
        this.fileFormat = fileFormat;
    }

    // Provides a description of the eBook
    @Override
    public void describeMaterial() {
        System.out.println("This is an eBook in " + fileFormat + " format.");
        super.describeMaterial();
    }

    // Returns a string representation of the eBook
    @Override
    public String toString() {
        return "EBook [Title: " + title + ", Author: " + author + ", File Format: " + fileFormat + ", Pages: " + numberOfPages + ", Publisher: " + publisher + "]";
    }
}