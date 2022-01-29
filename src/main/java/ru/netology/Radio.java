package ru.netology;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation;

    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    public int getcurrentRadioStation (){ return currentRadioStation;}

    public void setCurrentStation(int currentRadioStation) {

        if (currentRadioStation < maxRadioStation) {

            return;
        }
        if (currentRadioStation > minRadioStation) {

            return;

        }

        this.currentRadioStation = currentRadioStation;

    }


}
