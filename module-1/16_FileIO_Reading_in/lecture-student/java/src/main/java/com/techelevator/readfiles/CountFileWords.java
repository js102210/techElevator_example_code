package com.techelevator.readfiles;


import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class CountFileWords {
    public static void main(String[] args) {
       Path myFile = Path.of("Alice.txt");
       wordCounter wc = new wordCounter();
       int sum = 0;
       try (Scanner fileReader = new Scanner(myFile)){
           while (fileReader.hasNextLine()){
               String line = fileReader.nextLine();
               int count = wc.countWordsInLine(line);
               sum += count;
           }
        System.out.println(sum);
       } catch (IOException e){
           System.out.println("couldn't find the file *sad trombone sound*");
        }




    }
}
