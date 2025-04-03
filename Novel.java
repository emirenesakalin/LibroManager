public class Novel extends Book {
    private final String genre; // The genre of the novel

    // Constructor to initialize the novel's attributes
    public Novel(String title, int numberOfPages, String publisher, String author, String[] primaryCharacters, String genre) {
        super(title, numberOfPages, publisher, author, primaryCharacters);
        this.genre = genre;
    }

    // Provides a description of the novel
    @Override
    public void describeMaterial() {
        System.out.println("This is a novel of genre: " + genre + ".");
        super.describeMaterial();
    }

    // Returns a string representation of the novel
    @Override
    public String toString() {
        return "Novel [Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Pages: " + numberOfPages + ", Publisher: " + publisher + "]";
    }
}