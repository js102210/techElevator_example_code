package com.techelevator;

public class Elevator {
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public boolean isDoorOpen() {
        return this.doorOpen;
    }

    public Elevator (int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
        this.currentFloor = 1;
        this.doorOpen = false;

    }

    public void openDoor() {
        this.doorOpen = true;
    }

    public void closeDoor() {
        this.doorOpen = false;
    }

    public void goUp(int desiredFloor) {
        if (desiredFloor <= this.numberOfFloors && desiredFloor > this.currentFloor && desiredFloor > 0 && !this.doorOpen) {
            this.currentFloor = desiredFloor;
        }
    }

    public void goDown(int desiredFloor) {
        if (desiredFloor <= this.numberOfFloors && desiredFloor < this.currentFloor && desiredFloor > 0 && !this.doorOpen){
            this.currentFloor = desiredFloor;
        }
    }



}
