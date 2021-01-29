package com.techelevator;

public class TriangleWall extends Wall{
private int base;
private int height;

    public int getHeight() {
        return this.height;
    }

    public int getBase() {
        return this.base;
    }

    public TriangleWall(String name, String color, int base, int height){
        super(name, color);
        this.base = base;
        this.height = height;
    }

  public int getArea() {
        int area;
        area = (this.base * this.height) / 2;
        return area;
    }

    @Override
    public String toString() {
       return this.getName() + " "  + "(" + this.base + "x" + this.height + ") " + "triangle";
    }
}
