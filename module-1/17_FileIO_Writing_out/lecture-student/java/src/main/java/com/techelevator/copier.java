package com.techelevator;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class copier {
    public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the path of the existing file");
            Path myPath = Path.of(userInput.nextLine());
            System.out.println("Please enter the name of a file to copy to");
            String dest = userInput.nextLine();
            try (Scanner fileReader = new Scanner(myPath) ){
               try(PrintWriter fileWriter = new PrintWriter(dest)) {
                   while (fileReader.hasNextLine()) {
                       String fileLine = fileReader.nextLine();
                       fileWriter.println(fileLine.toUpperCase());
                   }
               } catch (IOException e) {
                   System.out.println("could not create the requested output file");
               }

            } catch (IOException e) {
                System.out.println("file not found");
            }



    }
}
