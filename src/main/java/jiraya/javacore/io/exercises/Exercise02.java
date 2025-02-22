package jiraya.javacore.io.exercises;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Exercise02 {
    //2. Writing to a File
    //Task:
    //Create a file named output.txt using FileWriter.
    //Write the following text into the file:
    //Hello, World!
    //Welcome to file handling in Java.
    //Close the file and verify the content using a FileReader.

    public static void main(String[] args) {
        File file = new File("output.txt");

        // Write to the file using FileWriter
        try (  FileWriter fileWriter = new FileWriter(file);){
            fileWriter.write("Hello, Word!\nWelcome to file handling in Java.");
            System.out.println("File written successfully.");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Verify the content using FileReader
        try (FileReader fileReader = new FileReader(file)) {
            System.out.println("Reading file content:");
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        Path sourcePath = file.toPath();
        Path targetPath = new File("practice_files/output.txt").toPath();
        try {
            Files.createDirectories(targetPath.getParent()); // Ensure the directory exists
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully to: " + targetPath);
        } catch (IOException e) {
            System.err.println("An error occurred while moving the file: " + e.getMessage());
        }
    }
}
