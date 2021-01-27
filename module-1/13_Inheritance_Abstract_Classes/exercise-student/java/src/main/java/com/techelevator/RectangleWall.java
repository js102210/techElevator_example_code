package com.techelevator;

public class RectangleWall extends Wall {
    private int length;
    private int height;

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;

    }



    public int getHeight() {
        return this.height;
    }

    public int getLength() {
        return this.length;
    }

    public int getArea() {
        int area = this.length * this.height;
        return area;
    }

    @Override
    public String toString() {
        return this.getName() + " "  + "(" + this.length + "x" + this.height+ ") " + "rectangle";
    }
}
