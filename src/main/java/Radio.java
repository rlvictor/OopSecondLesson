/*Station*/
public class Radio {
    public int currentStation;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 9) {
            currentStation = newCurrentStation;
        }
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation += 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation <= 9) {
            currentStation -= 1;
        }
        if (currentStation == -1) {
            currentStation = 9;
        }
    }

    /*Volume*/

    public int currentVolume;

    public void setVolumeMax() {
        currentVolume = 100;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setVolumeMin() {
        currentVolume = 0;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
