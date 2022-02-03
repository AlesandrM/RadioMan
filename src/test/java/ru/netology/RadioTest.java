package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test

    public void setCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        int currentRadioStation = radio.getCurrentRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test

    public void maxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(3);

        radio.toMaxRadioStation();

        int expected = 9;
        int currentRadioStation = radio.toMaxRadioStation();
        assertEquals(expected, currentRadioStation);
    }

    @Test

    public void minRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(7);

        cond.toMinRadioStation();

        int expected = 0;
        int currentRadioStation = cond.toMinRadioStation();
        assertEquals(expected, currentRadioStation);
    }

    @Test

    public void NextRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(3);

        cond.nextRadioStation();

        int expected = cond.nextRadioStation() +1;
        int currentRadioStation = cond.nextRadioStation();
        assertEquals(expected, currentRadioStation);
    }

    @Test

    public void setCurrentVolume(){

        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        int currentVolume = radio.getCurrentVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test

    public void maxVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(3);

        cond.toMaxVolume();

        int expected = 10;
        int currentVolume = cond.toMaxVolume();
        assertEquals(expected, currentVolume);
    }

    @Test

    public void minVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(7);

        cond.toMinVolume();

        int expected = 0;
        int currentVolume = cond.toMinVolume();
        assertEquals(expected, currentVolume);
    }

    @Test

    public void NextVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);

        cond.nextVolume();

        int expected = cond.nextVolume() + 1;
        int currentVolume = cond.nextVolume();
        assertEquals(expected, currentVolume);
    }
}