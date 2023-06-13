package ru.netology.radio;
public class Radio {
    public int currentStation;

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < 10) {
            currentStation += 1;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation <= 9) {
            currentStation -= 1;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public int currentVolume;

    public void setVolumeMin() {
        currentVolume = 0;
    }

    public void setVolumeMax() {
        currentVolume = 100;
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
