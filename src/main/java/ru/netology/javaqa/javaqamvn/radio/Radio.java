package ru.netology.javaqa.javaqamvn.radio;
public class Radio {
    private int currentVolume;
    private int numberStation;

    public int getNumberStation() {
        return numberStation;
    }
    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > 9) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void nextStation(){

        if (numberStation == 9){
            numberStation = 0;
        }
        else {
            numberStation = numberStation + 1;
            setNumberStation(numberStation);
        }


    }

    public void prevStation(){

        if (numberStation == 0){
            numberStation = 9;
        }
        else {
            numberStation = numberStation - 1;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }



}