package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentChanel;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxChanel() {
        currentVolume = 9;
    }

    public void setToMinChanel() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextChanel() {
        if (currentChanel >= 9) {
            setCurrentChanel(0);
        }
        else {
            setCurrentChanel(currentChanel + 1);
        }
    }

    public void prevChanel() {
        if (currentChanel <= 0) {
            setCurrentChanel(9);
        }
        else {
            setCurrentChanel(currentChanel - 1);
        }
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel > 9) {
            return;
        }
        if (currentChanel < 0) {
            return;
        }
        this.currentChanel = currentChanel;
    }
}