package com.techelevator.readfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {
        //Two ways to represent a file:
      /*  File myFile = new File("input.txt"); //Older style, can convert to Path with .toPath()
        Path myPath = Path.of("input.txt");    //Newer style, can convert to File with .toFile()

        try (Scanner fileScanner = new Scanner(myPath)){
            while (fileScanner.hasNextLine()){

                String s = fileScanner.nextLine();
                System.out.println(s);
            }
            fileScanner.close();


        } catch (IOException e) {
            System.out.println("Cannot read file");
        } */

        Path myPath = Path.of("alice.txt");

        wordCounter lineCount = new wordCounter();
        try(Scanner filescanner = new Scanner(myPath)) {
            int totalWords = 0;
            while (filescanner.hasNextLine()) {
                String line = filescanner.nextLine();
                if (line.length() > 0) {
                    line = line.trim();
                    int wordCountInLine = lineCount.countWordsInLine(line);
                    totalWords += wordCountInLine;
                }

            }
            System.out.print(totalWords);
        }
        catch (IOException e) {
           System.out.println("not there");
        }


    }




}
