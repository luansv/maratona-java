package jiraya.javacore.io.exercises;

import java.io.File;
import java.io.IOException;

public class Exercise01 {
    //1. File Handling Basics
    //Task: Write a program to perform the following operations:
    //Create a new text file named example.txt in a directory called practice_files.
    //Check if the file exists.
    //Display its absolute path and size.

    public static void main(String[] args) throws IOException {

        //create directory
        File fileDirectory = new File("practice_files");
        if (!fileDirectory.exists()) {
            boolean isDirectoryCreated = fileDirectory.mkdir();
            System.out.println("Directory created: " + isDirectoryCreated);
        }
        System.out.println("Directory already exists!");

        //create file inside the directory
        File file = new File(fileDirectory, "example.txt");
        if (!file.exists()) {
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("File created successfully.");
            }
        } else {
            System.out.println("File already exists.");
        }

        // Check file existence, path, and size
        if (file.exists()) {
            System.out.println("File exists: " + file.exists());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + "bytes");

        } else {
            System.out.println("File does not exists!");
        }

    }


}


