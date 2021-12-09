package ru.netology.domain;


// Поля объекта
public class Radio {
    private String name;
    private int currentRadioStation;
    private int currentVolume;
    private int countOfRadioStations = 10;

    // Геттер и сеттер на новое поле количество радиостанций
    public int getCountOfRadioStations() {
        return countOfRadioStations;
    }

    public void setCountOfRadioStations(int countOfRadioStations) {
        if (countOfRadioStations < 0) {
            return;
        }
        this.countOfRadioStations = countOfRadioStations;
    }


    // Конструктор с параметром "количество радиостанций"
    public Radio(int countOfRadioStations) {
        this.countOfRadioStations = countOfRadioStations;
    }
    // Конструктор без параметров
    public Radio() {
    }

    // Следующая радиостанция
    public void nextRadioStation() {
        if (currentRadioStation < countOfRadioStations - 1) {
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
            currentRadioStation = countOfRadioStations -1;
        }
    }

    // Увеличение громкости
    public void increaseVolume() {
        if (currentVolume < 100) {
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
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}


