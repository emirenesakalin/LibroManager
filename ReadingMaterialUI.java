import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReadingMaterialUI extends JFrame {
    // Declare input fields and components
    private JTextField titleField, authorField, pagesField, publisherField, genreField, issueNumberField, publicationDateField, subjectField, academicLevelField, fileFormatField, illustratorField;
    private JComboBox<String> materialTypeComboBox;
    private JButton addButton;
    private JTextArea outputArea;

    public ReadingMaterialUI() {
        // Set up the main window
        setTitle("Reading Material Manager");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Panel for material type selection
        JPanel typePanel = new JPanel();
        typePanel.add(new JLabel("Select Material Type:"));
        String[] materialTypes = {"Book", "Novel", "Magazine", "Technical Journal", "Textbook", "Comic Book", "EBook"};
        materialTypeComboBox = new JComboBox<>(materialTypes);
        materialTypeComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updateFieldEditableState(); // Update field states when material type changes
            }
        });
        typePanel.add(materialTypeComboBox);

        // Panel for input fields
        JPanel inputPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        titleField = new JTextField(20);
        authorField = new JTextField(20);
        pagesField = new JTextField(20);
        publisherField = new JTextField(20);
        genreField = new JTextField(20);
        issueNumberField = new JTextField(20);
        publicationDateField = new JTextField(20);
        subjectField = new JTextField(20);
        academicLevelField = new JTextField(20);
        fileFormatField = new JTextField(20);
        illustratorField = new JTextField(20);

        // Add labels and fields to the input panel
        inputPanel.add(new JLabel("Title:"));
        inputPanel.add(titleField);
        inputPanel.add(new JLabel("Author:"));
        inputPanel.add(authorField);
        inputPanel.add(new JLabel("Number of Pages:"));
        inputPanel.add(pagesField);
        inputPanel.add(new JLabel("Publisher:"));
        inputPanel.add(publisherField);
        inputPanel.add(new JLabel("Genre:"));
        inputPanel.add(genreField);
        inputPanel.add(new JLabel("Issue Number:"));
        inputPanel.add(issueNumberField);
        inputPanel.add(new JLabel("Publication Date:"));
        inputPanel.add(publicationDateField);
        inputPanel.add(new JLabel("Subject:"));
        inputPanel.add(subjectField);
        inputPanel.add(new JLabel("Academic Level:"));
        inputPanel.add(academicLevelField);
        inputPanel.add(new JLabel("File Format:"));
        inputPanel.add(fileFormatField);
        inputPanel.add(new JLabel("Illustrator:"));
        inputPanel.add(illustratorField);

        // Add button to trigger material addition
        addButton = new JButton("Add Material");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMaterial();
            }
        });

        // Output area to display results
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add all components to the main panel
        mainPanel.add(typePanel, BorderLayout.NORTH);
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(addButton, BorderLayout.SOUTH);
        mainPanel.add(scrollPane, BorderLayout.EAST);

        add(mainPanel);
        setVisible(true);

        // Initialize field states based on the default selected material type
        updateFieldEditableState();
    }

    // Method to update the editable state of fields based on the selected material type
    private void updateFieldEditableState() {
        String materialType = (String) materialTypeComboBox.getSelectedItem();

        // Reset all fields to editable
        titleField.setEditable(true);
        authorField.setEditable(true);
        pagesField.setEditable(true);
        publisherField.setEditable(true);
        genreField.setEditable(true);
        issueNumberField.setEditable(true);
        publicationDateField.setEditable(true);
        subjectField.setEditable(true);
        academicLevelField.setEditable(true);
        fileFormatField.setEditable(true);
        illustratorField.setEditable(true);

        // Disable fields based on the selected material type
        switch (materialType) {
            case "Book":
                genreField.setEditable(false);
                issueNumberField.setEditable(false);
                publicationDateField.setEditable(false);
                subjectField.setEditable(false);
                academicLevelField.setEditable(false);
                fileFormatField.setEditable(false);
                illustratorField.setEditable(false);
                break;
            case "Novel":
                issueNumberField.setEditable(false);
                publicationDateField.setEditable(false);
                subjectField.setEditable(false);
                academicLevelField.setEditable(false);
                fileFormatField.setEditable(false);
                illustratorField.setEditable(false);
                break;
            case "Magazine":
                genreField.setEditable(false);
                subjectField.setEditable(false);
                academicLevelField.setEditable(false);
                fileFormatField.setEditable(false);
                illustratorField.setEditable(false);
                break;
            case "Technical Journal":
                genreField.setEditable(false);
                issueNumberField.setEditable(false);
                publicationDateField.setEditable(false);
                subjectField.setEditable(false);
                academicLevelField.setEditable(false);
                fileFormatField.setEditable(false);
                illustratorField.setEditable(false);
                break;
            case "Textbook":
                genreField.setEditable(false);
                issueNumberField.setEditable(false);
                publicationDateField.setEditable(false);
                fileFormatField.setEditable(false);
                illustratorField.setEditable(false);
                break;
            case "Comic Book":
                genreField.setEditable(false);
                issueNumberField.setEditable(false);
                publicationDateField.setEditable(false);
                subjectField.setEditable(false);
                academicLevelField.setEditable(false);
                fileFormatField.setEditable(false);
                break;
            case "EBook":
                genreField.setEditable(false);
                issueNumberField.setEditable(false);
                publicationDateField.setEditable(false);
                subjectField.setEditable(false);
                academicLevelField.setEditable(false);
                illustratorField.setEditable(false);
                break;
        }
    }

    private void addMaterial() {
        try {
            // Retrieve input values
            String title = titleField.getText();
            int pages = Integer.parseInt(pagesField.getText());
            String publisher = publisherField.getText();
            String author = authorField.getText();
            String materialType = (String) materialTypeComboBox.getSelectedItem();

            // Handle different material types
            switch (materialType) {
                case "Book":
                    Book book = new Book(title, pages, publisher, author, new String[]{});
                    book.displayDetails();
                    book.describeMaterial();
                    outputArea.append("Book added: " + title + "\n");
                    break;
                case "Novel":
                    String genre = genreField.getText();
                    Novel novel = new Novel(title, pages, publisher, author, new String[]{}, genre);
                    novel.displayDetails();
                    novel.describeMaterial();
                    outputArea.append("Novel added: " + title + "\n");
                    break;
                case "Magazine":
                    int issueNumber = Integer.parseInt(issueNumberField.getText());
                    String publicationDate = publicationDateField.getText();
                    Magazine magazine = new Magazine(title, pages, publisher, issueNumber, publicationDate);
                    magazine.displayDetails();
                    magazine.describeMaterial();
                    outputArea.append("Magazine added: " + title + "\n");
                    break;
                case "Technical Journal":
                    // Placeholder for Technical Journal implementation
                    outputArea.append("Technical Journal not implemented yet.\n");
                    break;
                case "Textbook":
                    String subject = subjectField.getText();
                    String academicLevel = academicLevelField.getText();
                    Textbook textbook = new Textbook(title, pages, publisher, subject, academicLevel);
                    textbook.displayDetails();
                    textbook.describeMaterial();
                    outputArea.append("Textbook added: " + title + "\n");
                    break;
                case "Comic Book":
                    String illustrator = illustratorField.getText();
                    ComicBook comic = new ComicBook(title, pages, publisher, author, new String[]{}, illustrator);
                    comic.displayDetails();
                    comic.describeMaterial();
                    outputArea.append("Comic Book added: " + title + "\n");
                    break;
                case "EBook":
                    String fileFormat = fileFormatField.getText();
                    EBook ebook = new EBook(title, pages, publisher, author, new String[]{}, fileFormat);
                    ebook.displayDetails();
                    ebook.describeMaterial();
                    outputArea.append("EBook added: " + title + "\n");
                    break;
                default:
                    outputArea.append("Invalid material type selected.\n");
                    break;
            }
        } catch (NumberFormatException ex) {
            // Handle invalid number input
            outputArea.append("Error: Please enter valid numbers for pages and issue number.\n");
        } catch (Exception ex) {
            // Handle other exceptions
            outputArea.append("Error: " + ex.getMessage() + "\n");
        }
    }

    public static void main(String[] args) {
        // Launch the application
        new ReadingMaterialUI();
    }
}