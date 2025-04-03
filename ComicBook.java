public class ComicBook extends Book {
    private final String illustrator; // The illustrator of the comic book

    // Constructor to initialize the comic book's attributes
    public ComicBook(String title, int numberOfPages, String publisher, String author, String[] primaryCharacters, String illustrator) {
        super(title, numberOfPages, publisher, author, primaryCharacters);
        this.illustrator = illustrator;
    }

    // Provides a description of the comic book
    @Override
    public void describeMaterial() {
        System.out.println("This is a comic book illustrated by " + illustrator + ".");
        super.describeMaterial();
    }

    // Returns a string representation of the comic book
    @Override
    public String toString() {
        return "ComicBook [Title: " + title + ", Author: " + author + ", Illustrator: " + illustrator + ", Pages: " + numberOfPages + ", Publisher: " + publisher + "]";
    }
}