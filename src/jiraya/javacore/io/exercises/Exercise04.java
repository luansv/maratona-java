package jiraya.javacore.io.exercises;

import java.io.File;
import java.io.IOException;

public class Exercise04 {
    public static void main(String[] args) throws IOException {
        // Create a directory
        File fileDirectory = new File("test_directory");
        if (!fileDirectory.exists()) {
            boolean isDirectoryCreated = fileDirectory.mkdir();
            System.out.println("Directory created: " + isDirectoryCreated);
        } else {
            System.out.println("Directory is already created.");
        }

        // Create files inside the directory
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt"};
        for (String filename : fileNames) {
            File file = new File(fileDirectory, filename);
            if (!file.exists()) {
                boolean isFile = file.createNewFile();
                System.out.println(filename + " created successfully.");
            } else {
                System.out.println(filename + " already exists.");
            }
        }

        // List all files in the directory and display their names and sizes
        File[] files = fileDirectory.listFiles(); // Retrieve the list of files
        if (files != null) {
            System.out.println("\nFiles in the directory:");
            for (File fl : files) {
                System.out.println("Name: " + fl.getName() + ", Size: " + fl.length() + " bytes");
            }
        } else {
            System.out.println("No files found in the directory.");
        }
    }
}
