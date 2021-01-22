package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableFirstClassSeats;
    private int availableCoachSeats;

    public String getPlaneNumber() {
        return this.planeNumber;
    }
    public int getTotalFirstClassSeats() {
        return this.totalFirstClassSeats;
    }
    public int getBookedFirstClassSeats() {
        return this.bookedFirstClassSeats;
    }
    public int getTotalCoachSeats() {
        return this.totalCoachSeats;
    }
    public int getBookedCoachSeats() {
        return this.bookedCoachSeats;
    }
    public int getAvailableFirstClassSeats() {
        return this.availableFirstClassSeats;
    }
    public int getAvailableCoachSeats() {
        return this.availableCoachSeats;
    }


    public Airplane (String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
        this.availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
        this.availableCoachSeats = totalCoachSeats - bookedCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        boolean result = false;
        if (forFirstClass) {
            this.bookedFirstClassSeats += totalNumberOfSeats;
            this.availableFirstClassSeats -= totalNumberOfSeats;
            if (this.availableFirstClassSeats >= 0) {
                result = true;
            } else {
                this.bookedFirstClassSeats -= totalNumberOfSeats;
                this.availableFirstClassSeats += totalNumberOfSeats;
            }

        } else {
            this.bookedCoachSeats += totalNumberOfSeats;
            this.availableCoachSeats -= totalNumberOfSeats;
            if (this.availableCoachSeats >= 0) {
                result = true;
            } else {
                this.bookedCoachSeats -= totalNumberOfSeats;
                this.availableCoachSeats += totalNumberOfSeats;
            }
        }
        return result;
    }



}
