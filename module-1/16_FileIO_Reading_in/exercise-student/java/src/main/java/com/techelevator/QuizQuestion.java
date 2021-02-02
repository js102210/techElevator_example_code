package com.techelevator;

import java.util.Scanner;

public class QuizQuestion {
    private String question;

    private String[] displayArray;
    private int correctResponse;
    private boolean answeredCorrectly;

    public QuizQuestion(String[] questionArr) {
        this.question = questionArr[0];
        int i = 0;
        int index = 0;
        this.displayArray = new String[questionArr.length];
        displayArray[0] = this.question;
        for (String answer : questionArr) {
            if (answer.contains("*")){

                answer = answer.replace("*", "");
                this.correctResponse = i;
            }
              if(!answer.equals(this.question)) displayArray[index]  = i + ". " + answer;
            index++;
            i++;
        }

    }

    public void askQuestion() {
        for (String questionLine : this.displayArray){
            System.out.println(questionLine);
        }
        Scanner input = new Scanner(System.in);
        String response = input.nextLine();
        if (Integer.parseInt(response) == this.correctResponse) {
            System.out.println("Right!");
            answeredCorrectly = true;
        } else {
            System.out.println("Wrong!");
            answeredCorrectly = false;
        }
    }

    public boolean wasAnsweredRight(){
        return this.answeredCorrectly;
    }

}
