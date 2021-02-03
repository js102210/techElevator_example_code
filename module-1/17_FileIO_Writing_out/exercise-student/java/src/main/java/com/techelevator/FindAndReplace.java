package com.techelevator;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); //take inputs from user
        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();
        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();
        System.out.println("What the source file?");
        Path sourceFile = Path.of(userInput.nextLine());
        System.out.println("What the destination file?");
        String destFile = userInput.nextLine();

        try (Scanner fileReader = new Scanner(sourceFile)) { // create dest file
            try (PrintWriter fileWriter = new PrintWriter(destFile)) {
                String currentLine;
                String replacedLine;
                while (fileReader.hasNextLine()){ //write each line of source file to dest file, replacing the input word with the provided replacement
                    currentLine = fileReader.nextLine();
                    replacedLine = currentLine.replaceAll(searchWord, replacementWord);
                    fileWriter.println(replacedLine);
                }

            } catch (IOException e) {
                System.out.println("The new file cannot be created (it may already exist).");
            }
        } catch (IOException e) {
            System.out.println("The source file was not found.");
        }

    }

}
