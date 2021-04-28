package ru.netology;

public class Radio {
    int numberChannelMin;
    int numberChannelMax;
    int volumeLevelMin;
    int volumeLevelMax;
    boolean radioOn;
    boolean radioVolumeMax;
    boolean radioVolumeMin;

    public int getNumberChannelMin() {
        return numberChannelMin;
    }

    public void setNumberChannelMin(int numberChannelMin) {
        if (currentChannel = numberChannelMax) {
            this.numberChannelMin = numberChannelMin;
        }
    }

    public int getNumberChannelMax() {
        return numberChannelMax;
    }

    public void setNumberChannelMax(int numberChannelMax) {
        if (currentChannel = numberChannelMin) {
            this.numberChannelMax = numberChannelMax;
        }
    }

    public int getVolumeLevelMin() {
        return volumeLevelMin;
    }

    public void setVolumeLevelMin(int volumeLevelMin) {
        if (currentVolume = volumeLevelMax) {
            this.volumeLevelMin = volumeLevelMin;
        }
    }

    public int getVolumeLevelMax() {
        return volumeLevelMax;
    }

    public void setVolumeLevelMax(int volumeLevelMax) {
        if (currentVolume = volumeLevelMin) {
            this.volumeLevelMax = volumeLevelMax;
        }
    }

    public boolean isRadioVolumeMax() {
        return radioVolumeMax;
    }

    public void setRadioVolumeMax(boolean radioVolumeMax) {
        if (currentVolume < volumeLevelMin) {
            return;
            this.volumeLevelMax = volumeLevelMax;
        }
    }

    public boolean isRadioVolumeMin() {
        return radioVolumeMin;
    }

    public void setRadioVolumeMin(boolean radioVolumeMin) {
        if (currentVolume > volumeLevelMax) {
            return;
            this.volumeLevelMin = volumeLevelMin;
        }
    }

    public boolean isRadioOn() {
        // true - radio on ; false - radio off
        if (currentRadioStatus = false) {
            return
        }

    }

}

