package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test

    public void setCurrentRadioStation() {

        radio.setCurrentRadioStation(9);
        int currentRadioStation = radio.getCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test

    public void maxRadioStation() {

        radio.setCurrentRadioStation(3);

        radio.toMaxRadioStation();

        int expected = 9;
        int currentRadioStation = radio.toMaxRadioStation();
        assertEquals(expected, currentRadioStation);
    }

    @Test

    public void minRadioStation() {


        radio.setCurrentRadioStation(7);

        radio.toMinRadioStation();

        int expected = 0;
        int currentRadioStation = radio.toMinRadioStation();
        assertEquals(expected, currentRadioStation);
    }

    @Test

    public void NextRadioStation() {

        radio.setCurrentRadioStation(3);

        radio.nextRadioStation();

        int expected = radio.nextRadioStation() +1;
        int currentRadioStation = radio.nextRadioStation();
        assertEquals(expected, currentRadioStation);
    }

    @Test

    public void setCurrentVolume(){

        radio.setCurrentVolume(7);
        int currentVolume = radio.getCurrentVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test

    public void maxVolume() {


        radio.setCurrentVolume(3);

        radio.toMaxVolume();

        int expected = 10;
        int currentVolume = radio.toMaxVolume();
        assertEquals(expected, currentVolume);
    }

    @Test

    public void minVolume() {


        radio.setCurrentVolume(7);

        radio.toMinVolume();

        int expected = 0;
        int currentVolume = radio.toMinVolume();
        assertEquals(expected, currentVolume);
    }

    @Test

    public void NextVolume() {


        radio.setCurrentVolume(1);

        radio.nextVolume();

        int expected = radio.nextVolume() + 1;
        int currentVolume = radio.nextVolume();
        assertEquals(expected, currentVolume);
    }
}