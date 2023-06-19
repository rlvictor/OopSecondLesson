package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int amountStations = 10;
    private int currentStation;
    private int currentVolume;

    public Radio(int amountStations) {
        this.amountStations = amountStations;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > (amountStations - 1)) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation == (amountStations - 1)) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = (amountStations - 1);
        } else {
            currentStation -= 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
