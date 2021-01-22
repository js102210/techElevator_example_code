package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    //private String letterGrade;

    //getters
    public int getEarnedMarks(){
        return this.earnedMarks;
    }

    public int getPossibleMarks() {
        return this.possibleMarks;
    }

    public String getSubmitterName () {
        return this.submitterName;
    }

    public String getLetterGrade() {
        double earnedMarksDouble = earnedMarks;
        double possibleMarksDouble = possibleMarks;
        double percentRight = earnedMarksDouble / possibleMarksDouble ;
        String letterGrade;
        if (percentRight * 100 < 60.00) {
            letterGrade = "F";
        } else if (percentRight * 100 < 70.00) {
            letterGrade = "D";
        } else if(percentRight * 100 < 80.00) {
            letterGrade = "C";
        } else if (percentRight * 100 < 90.00) {
            letterGrade = "B";
        } else {
            letterGrade = "A";
        }
        return letterGrade;
    }


    //setters
    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    //constructor
    public HomeworkAssignment (int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;

    }


}
