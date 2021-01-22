package com.techelevator;

public class Television {
    public boolean on = false;
    public int currentChannel = 3;
    public int currentVolume = 2;

    public boolean isOn() {
        return this.on;
    }
    public int getCurrentChannel(){
        return this.currentChannel;
    }
    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void turnOff() {
        this.on = false;
    }
    public void turnOn() {
        this.on = true;
    }
    public void changeChannel(int newChannel) {
        if (this.on && (newChannel > 2 && newChannel < 19)) {
            this.currentChannel = newChannel;
        }
    }
    public void channelUp() {
        if (this.on) {
            this.currentChannel ++;
            if (this.currentChannel > 18) {
                this.currentChannel = 3;
            }
        }
    }
    public void channelDown() {
        if (this.on) {
            this.currentChannel -= 1;
            if (this.currentChannel < 3) {
                this.currentChannel = 18;
            }
        }
    }

    public void raiseVolume() {
        if (this.on && this.currentVolume <= 9){
            this.currentVolume ++;
        }
    }

    public void lowerVolume() {
        if (this.on && this.currentVolume >= 1) {
            this.currentVolume -= 1;
        }
    }


}
