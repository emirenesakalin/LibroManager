public class Test {
    public static void main(String[] args) {
        Book book = new Book(
                "The Little Prince",
                112,
                "Pegasus",
                "Antoine de Saint-Exupéry",
                new String[]{"Little Prince"});

        Novel novel = new Novel(
                "The Eye of Minds",
                304,
                "Pegasus",
                "James Dashner",
                new String[]{"Michael", "Sarah", "Brian"}, "Science Fiction");

        Magazine magazine = new Magazine(
                "National Geographic",
                123,
                "NatGeo",
                2024,
                "November 2024");

        TechnicalJournal journal = new TechnicalJournal(
                "IEEE Transactions on Neural Networks",
                150,
                "IEEE",
                "Artificial Intelligence and Machine Learning",
                11.23,
                32,
                4,
                2024);

        Textbook textbook = new Textbook(
                "Modern Physics for Scientists and Engineers",
                850,
                "Pearson Education",
                "Physics",
                "Undergraduate");

        ComicBook comic = new ComicBook(
                "Spider-Man",
                50,
                "Marvel",
                "Stan Lee",
                new String[]{"Peter Parker", "Mary Jane"},
                "Steve Ditko");

        EBook ebook = new EBook(
                "Clean Code",
                464,
                "Prentice Hall",
                "Robert C. Martin",
                new String[]{},
                "PDF");

        // Display details and descriptions
        book.displayDetails();
        book.describeMaterial();

        System.out.println();

        novel.displayDetails();
        novel.describeMaterial();

        System.out.println();

        magazine.displayDetails();
        magazine.describeMaterial();

        System.out.println();

        journal.displayDetails();
        journal.describeMaterial();

        System.out.println();

        textbook.displayDetails();
        textbook.describeMaterial();

        System.out.println();

        comic.displayDetails();
        comic.describeMaterial();

        System.out.println();

        ebook.displayDetails();
        ebook.describeMaterial();

        // Save to file
        FileHandler.saveToFile(book, "books.txt");
        FileHandler.saveToFile(novel, "books.txt");
        FileHandler.saveToFile(magazine, "books.txt");
        FileHandler.saveToFile(journal, "books.txt");
        FileHandler.saveToFile(textbook, "books.txt");
        FileHandler.saveToFile(comic, "books.txt");
        FileHandler.saveToFile(ebook, "books.txt");
    }
}