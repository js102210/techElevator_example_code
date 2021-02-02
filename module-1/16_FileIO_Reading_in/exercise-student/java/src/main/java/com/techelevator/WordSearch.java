package com.techelevator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the fully qualified name of the file that should be searched?");
        String response = input.nextLine();
        Path myPath = Path.of(response);
        System.out.println("What is the search word you are looking for?");
        String wordToFind = input.nextLine();
        System.out.println("Should the search be case sensitive? (Y\\N");
        boolean respectCases = input.nextLine().equals("Y");
        if (!respectCases) {
            wordToFind = wordToFind.toLowerCase();
        }

        try (Scanner fileReader = new Scanner(myPath)) {
            int lineNumber = 1;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String lineVersionToSearch = "";
                if (!respectCases) {
                    lineVersionToSearch = line.toLowerCase();
                } else {
                    lineVersionToSearch = line;
                }
                if (lineVersionToSearch.contains(wordToFind)) {
                        System.out.println(lineNumber + ") " + line);
                    }

                lineNumber++;
            }

        } catch (IOException e) {

            System.out.println("File not found");
        }


    }

}
