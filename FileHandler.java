import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    /**
     * Saves the given ReadingMaterial object to the specified file.
     * The material's string representation (from toString()) is appended to the file.
     *
     * @param material The ReadingMaterial object to save.
     * @param filename The name of the file where the material will be saved.
     */
    public static void saveToFile(ReadingMaterial material, String filename) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(material.toString() + "\n"); // Append the material's string representation to the file
        } catch (IOException e) {
            System.out.println("An error occurred while saving to file.");
            e.printStackTrace();
        }
    }
}