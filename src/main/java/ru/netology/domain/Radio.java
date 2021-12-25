package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

// Поля объекта
public class Radio {
    private String name;
    private int currentRadioStation;
    private int currentVolume;
    private int countOfRadioStations = 10;

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
            currentRadioStation = countOfRadioStations - 1;
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

    // Сеттеры с логикой

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > countOfRadioStations - 1) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCountOfRadioStations(int countOfRadioStations) {
        if (countOfRadioStations < 0) {
            return;
        }
        this.countOfRadioStations = countOfRadioStations;
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


    // Консутруктор с параметром количество радиостанций
    public Radio(int countOfRadioStation) {
        this.countOfRadioStations = countOfRadioStation;
    }
}



