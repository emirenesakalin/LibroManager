public abstract class ReadingMaterial {
    protected String title; // The title of the reading material
    protected int numberOfPages; // The number of pages in the material
    protected String publisher; // The publisher of the material

    // Constructor to initialize common attributes
    public ReadingMaterial(String title, int numberOfPages, String publisher) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    // Displays the basic details of the reading material
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Publisher: " + publisher);
    }

    // Abstract method to describe the material
    public abstract void describeMaterial();

    // Returns a string representation of the reading material
    @Override
    public String toString() {
        return "ReadingMaterial [Title: " + title + ", Pages: " + numberOfPages + ", Publisher: " + publisher + "]";
    }
}