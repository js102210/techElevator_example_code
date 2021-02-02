package com.techelevator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the fully qualified name of the file to read in for quiz questions");
		String response = input.nextLine();
		Path myPath = Path.of(response);
		try (Scanner fileReader = new Scanner(myPath)){
			List<QuizQuestion> quiz = new ArrayList<>();

			while(fileReader.hasNextLine()){
				String[] questionArr = fileReader.nextLine().split("\\|");
				QuizQuestion question = new QuizQuestion(questionArr);
				quiz.add(question);
			}
			int answeredRight = 0;
			for(QuizQuestion question : quiz){
				question.askQuestion();
				if (question.wasAnsweredRight()){
					answeredRight++;
				}
			}
			System.out.println("You got " + answeredRight + " answer(s) correct out of the " + quiz.size()
			+ " questions asked.");



		} catch (IOException e) {
			System.out.println("File not found.");
		}

	}

}
