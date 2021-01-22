package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public String getTypeOfFruit() {
        return this.typeOfFruit;
    }

   public int getPiecesOfFruitLeft () {
        return this.piecesOfFruitLeft;
    }

    public FruitTree (String typeOfFruit, int piecesOfFruitLeft) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;

    }

    public boolean pickFruit (int numberOfPiecesToRemove) {

        if (this.piecesOfFruitLeft >= numberOfPiecesToRemove) {
            this.piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        } else {

            return false;
        }
    }



}
