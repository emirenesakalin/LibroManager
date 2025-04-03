public class Book extends ReadingMaterial {
    protected String author; // The author of the book
    protected String[] primaryCharacters; // Array of primary characters in the book

    // Constructor to initialize the book's attributes
    public Book(String title, int numberOfPages, String publisher, String author, String[] primaryCharacters) {
        super(title, numberOfPages, publisher);
        this.author = author;
        this.primaryCharacters = primaryCharacters;
    }

    // Provides a description of the book
    @Override
    public void describeMaterial() {
        System.out.println("This is a book written by " + author + ".");
        if (primaryCharacters.length > 0) {
            System.out.print("Primary Characters: ");
            for (String character : primaryCharacters) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }

    // Returns a string representation of the book
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", Pages: " + numberOfPages + ", Publisher: " + publisher + "]";
    }
}