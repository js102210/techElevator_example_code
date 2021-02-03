package com.techelevator;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileSplitter {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Where is the input file (please include the path to the file)?");
        String filePathString = userInput.nextLine();
        String[] filePathArr = filePathString.split("\\\\"); // create an array delimited by \ so the user can enter absolute path or file name
        Path myPath = Path.of(filePathString); // create a Path from the input
        String nameOfFile = filePathArr[filePathArr.length - 1]; //identify the last element of the array as the file to be split
        int indexOfSeparator = nameOfFile.lastIndexOf("."); //identify the index of the separator of prefix and file type
        String prefixOfFile = nameOfFile.substring(0, indexOfSeparator); //create a string of the file prefix
        String fileType = nameOfFile.substring(indexOfSeparator + 1); //create a string of the file type
        System.out.println("How many lines of text (max) should there be in the split files?");
        int maxLinesPerFile = Integer.parseInt(userInput.nextLine()); //determine how many lines each file may have

        try (Scanner fileReader = new Scanner(myPath)) { //read source file and initialize variables for lines copied to current output file, how many files have been created and whether the current one is "full"
            int linesCopiedToFile = 0;
            int fileNumber = 1;
            boolean fileFull = false;
            while(fileReader.hasNextLine()) {// loop to keep creating files with correct names until the source file has been fully copied
                String newFileName = prefixOfFile + "-" + fileNumber + "." + fileType;
                while (fileReader.hasNextLine() && linesCopiedToFile < maxLinesPerFile) { // loop to write lines to the current output file until it is "full"
                    try (FileWriter fileWriter = new FileWriter(newFileName, true)) {
                        String fileLine = fileReader.nextLine();
                        if (linesCopiedToFile == 0) {
                            fileWriter.write(fileLine);
                        } else {
                            fileWriter.write("\n" + fileLine);
                        }
                        linesCopiedToFile++;
                        if (linesCopiedToFile >= maxLinesPerFile) { //mark the current file "full" before exiting this iteration of the loop
                           fileFull = true;
                        }
                    } catch (IOException e) {
                        System.out.println("Could not create the file.");
                    }
                } if (fileFull) { // if the current file is full, increment file number (for the naming of the next one), set the lines copied to it to 0.
                    linesCopiedToFile = 0;
                    fileNumber++;
                }
            }
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}
