package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    private final int maxCurrentVolume = 100;
    private final int minCurrentVolume = 0;
    private int currentVolume = minCurrentVolume;
    private int maxNumberStation = 10;
    private final int minNumberStation = 0;
    private int numberStation = minNumberStation;

    public Radio() {
    }

    public Radio(int numberOfStation) {
        maxNumberStation = numberOfStation - 1;
    }


    public int getNumberStation() {
        return numberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < minNumberStation) {
            return;
        }
        if (newNumberStation > maxNumberStation) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void nextStation() {

        if (numberStation == maxNumberStation) {
            numberStation = minNumberStation;
        } else {
            numberStation = numberStation + 1;
            setNumberStation(numberStation);
        }
    }

    public void prevStation() {

        if (numberStation == minNumberStation) {
            numberStation = maxNumberStation;
        } else {
            numberStation = numberStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(int newCurrentVolume) {

        if (newCurrentVolume < minCurrentVolume) {
            return;
        }
        if (newCurrentVolume > maxCurrentVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void lowerVolume() {

        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}