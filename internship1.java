import java.io.*;
import java.util.*;

public class internship1 {

    // Path to the text file
    private static final String FILE_PATH = "sample.txt";

    public static void main(String[] args) {
        try {
            // 1. Write initial content to the file
            writeToFile("Hello, this is the first line.\nThis is the second line.");

            // 2. Read and display the content
            System.out.println("Original File Content:");
            readFromFile();

            // 3. Modify the file by appending new text
            modifyFile("\nThis is an appended line.");

            // 4. Read and display the updated content
            System.out.println("\nUpdated File Content:");
            readFromFile();

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    /**
     * Writes the specified content to the file.
     * If the file exists, it will be overwritten.
     */
    public static void writeToFile(String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(content);
        }
    }

    /**
     * Reads and prints the content of the file.
     */
    public static void readFromFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    /**
     * Appends the specified content to the file.
     */
    public static void modifyFile(String contentToAppend) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(contentToAppend);
        }
    }
}
