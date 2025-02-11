package jiraya.javacore.io.exercises;

import java.io.*;

public class Exercise03 {
    //3. Using BufferedWriter and BufferedReader
    //Task:
    //Create a text file named notes.txt.
    //Use BufferedWriter to write multiple lines into the file, such as:
    //Line 1: Java is versatile.
    //Line 2: Practice makes perfect.
    //Use BufferedReader to read the file line by line and print each line to the console.

    public static void main(String[] args) {

        //Create text file
        File file = new File("notes.txt");

        //Use BufferedWritter
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            bufferedWriter.write("Java is versatile.");
            bufferedWriter.newLine();
            bufferedWriter.write("Practice makes perfect.");
        } catch (IOException e) {
            System.out.println("Error accurred while writing the file: " + e.getMessage());
        }

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }
        } catch (IOException e) {
            System.out.println("Error occurred while reading the file: " + e.getMessage());
        }
    }
}
