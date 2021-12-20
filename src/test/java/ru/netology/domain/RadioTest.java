package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldName() {
        Radio radio = new Radio();
        radio.setName("Станция 1");
        assertEquals("Станция 1", radio.getName());
    }


    @Test
    public void shouldSetCountOfRadioStations1() {
        Radio radio = new Radio();
        radio.setCountOfRadioStations(1);
        assertEquals(1, radio.getCountOfRadioStations());
    }


    @Test
    public void shouldSetCountOfRadioStations0() {
        Radio radio = new Radio();
        radio.setCountOfRadioStations(0);
        assertEquals(0, radio.getCountOfRadioStations());
    }


    @Test
    public void shouldNotSetCountOfRadioStationsMinus1() {
        Radio radio = new Radio();
        radio.setCountOfRadioStations(-1);
        assertEquals(10, radio.getCountOfRadioStations());
    }

    @Test
    public void shouldUseConstructorNoArgs() {
        Radio radio = new Radio();
        assertEquals(10, radio.getCountOfRadioStations());
    }

    @Test
    public void shouldMakeCountOfRadioStations25() {
        Radio radio = new Radio(25);
        assertEquals(25, radio.getCountOfRadioStations());
    }


    @Test
    public void shouldMakeCountOfRadioStations0() {
        Radio radio = new Radio(0);
        assertEquals(0, radio.getCountOfRadioStations());
    }


    @Test
    public void shouldNotMakeCountOfRadioStationsMinus1() {
        Radio radio = new Radio();
        radio.setCountOfRadioStations(-1);
        assertEquals(10, radio.getCountOfRadioStations());
    }


    @Test
    public void shouldSetRadioStation0() {
        Radio radio = new Radio(8);
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSetRadioStation9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldNotSetRadioStationMinus1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldNotSetRadioStation10() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSetRadioStation10Count11() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(10);
        assertEquals(10, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldNotSetRadioStation11Count11() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldNextRadioStationFrom0To1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStationFrom9To0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldNextRadioStationFrom9To10Count11() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldPrevRadioStationFrom9To8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldPrevRadioStationFrom0To9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSetVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void shouldSetVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void shouldNotSetVolumeMinus1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void shouldNotSetVolume101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseVolumeFrom0To1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseVolumeFrom99To100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void shouldNotIncreaseVolumeFrom100To101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void shouldDecreaseVolumeFrom100To99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }


    @Test
    public void shouldDecreaseVolumeFrom1To0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void shouldNotDecreaseVolumeFrom0ToMinus1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}