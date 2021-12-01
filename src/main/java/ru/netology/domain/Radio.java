package ru.netology.domain;


// Поля объекта
public class Radio {
    private String name;
    private int currentRadioStation;
    private int currentVolume;


    // Следующая радиостанция
    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }


    // Предыдущая радиостанция
    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    // Увеличение громкости
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    // Уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    // Далее идут геттеры и сеттеры для полей
    // Геттер и сеттер для поля Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Геттер и сеттер для поля CurrentRadioStation
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    // Геттер и сеттер для поля CurrentVolume
    public int getCurrentVolume() {
        return currentVolume;
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
}


