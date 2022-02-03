package ru.netology;

public class Radio {


    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation;

    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public Radio() {

    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation > minRadioStation) {

            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation < maxRadioStation) {

            currentRadioStation = currentRadioStation = 0;

        }

        this.currentRadioStation = currentRadioStation;

    }

    public int toMaxRadioStation() {

        currentRadioStation = 9;


        return 9;
    }

    public int toMinRadioStation() {

        currentRadioStation = 0;
        return 0;
    }


    public int nextRadioStation() {
        if (currentRadioStation < 9)
            currentRadioStation = currentRadioStation + 1;

        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > minVolume) {

            currentVolume = currentVolume + 1;
        }

        if (currentVolume < minVolume) {

            currentVolume = currentVolume - 1;

        }

        this.currentVolume = currentVolume;

    }

    public int toMaxVolume() {

        currentVolume = 10;


        return 10;
    }

    public int toMinVolume() {

        currentVolume = 0;
        return 0;
    }

    public int nextVolume() {
        if (currentRadioStation < 10)
            currentRadioStation = currentRadioStation + 1;

        return currentRadioStation;
    }

}
