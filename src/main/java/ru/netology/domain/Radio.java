package ru.netology.domain;

public class Radio {
    private int id;
    private String name;
    private int radioStation;
    private int currentVolume;


    public void nextStation() {
        if (radioStation < 9) {
            radioStation = radioStation + 1;
        }
    }

    public void prevStation() {
        if (radioStation > 0) {
            radioStation = radioStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        int maxStation = 9;
        int minStation = 0;
        if ((radioStation + 1) > 9) {
            radioStation = minStation;
        }
        if ((radioStation - 1) < 0) {
            radioStation = maxStation;
        }
        this.radioStation = radioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10)
            return;
    }
//        this.currentVolume = currentVolume;
    }


