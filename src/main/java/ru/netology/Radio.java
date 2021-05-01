package ru.netology;

public class Radio {
    int numberChannelMin;
    int numberChannelMax;
    int volumeLevelMin;
    int volumeLevelMax;
    int currentChannel;
    int currentVolume;

    // Сделал конструктор,если потребуются дальнейшие действия с проектом
    public Radio(int numberChannelMax,int volumeLevelMax) {
        this.numberChannelMax = numberChannelMax;
        this.volumeLevelMax = volumeLevelMax;
    }
    //

    public int getNumberChannelMin() {
        return numberChannelMin;
    }

    public void setNumberChannelMin(int numberChannelMin) {
        this.numberChannelMin = numberChannelMin;
    }

    public int getNumberChannelMax() {
        return numberChannelMax;
    }

    public void setNumberChannelMax(int numberChannelMax) {
        this.numberChannelMax = numberChannelMax;
    }

    public int getVolumeLevelMin() {
        return volumeLevelMin;
    }

    public void setVolumeLevelMin(int volumeLevelMin) {
        this.volumeLevelMin = volumeLevelMin;
    }

    public int getVolumeLevelMax() {
        return volumeLevelMax;
    }

    public void setVolumeLevelMax(int volumeLevelMax) {
        this.volumeLevelMax = volumeLevelMax;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > numberChannelMax) {
            return; }
        if (currentChannel < numberChannelMin){
            return; }
        this.currentChannel = currentChannel;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > volumeLevelMax){
            return; }
        if (currentVolume < volumeLevelMin){
            return; }
        this.currentVolume = currentVolume;
    }

    public void switchChannelUp(int currentChannel){
        if (currentChannel >= numberChannelMax){
            setCurrentChannel(numberChannelMin);
        } else {
            setCurrentChannel(currentChannel+1);
        }
    }
    public void switchChannelDown(int currentChannel){
        if (currentChannel <= numberChannelMin){
            setCurrentChannel(numberChannelMax);
        } else {
            setCurrentChannel(currentChannel-1);
        }
    }
    public void switchVolumeUp(int currentVolume){
        if (currentVolume >= volumeLevelMax){
            setCurrentVolume(volumeLevelMax);
        } else {
            setCurrentVolume(currentVolume+1);
        }
    }
    public void switchVolumeDown(int currentVolume){
        if (currentVolume <= volumeLevelMin){
            setCurrentVolume(volumeLevelMin);
        } else {
            setCurrentVolume(currentVolume-1);
        }
    }


}
