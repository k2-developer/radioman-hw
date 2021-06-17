package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    public Radio radio = new Radio(9, 10);


    @Test
    void getNumberChannelMax() {
        assertEquals(9, radio.getNumberChannelMax());
    }

    @Test
    void getVolumeLevelMax() {
        assertEquals(10, radio.getVolumeLevelMax());
    }

    @Test
    void switchChannelUp() {
        radio.setCurrentChannel(5);
        radio.switchChannelUp();
        assertEquals(6, radio.currentChannel);
    }

    @Test
    void switchChannelDown() {
        radio.setCurrentChannel(5);
        radio.switchChannelDown();
        assertEquals(4, radio.currentChannel);

    }

    @Test
    void switchVolumeUp() {
        radio.setCurrentVolume(5);
        radio.switchVolumeUp();
        assertEquals(6, radio.currentVolume);
    }

    @Test
    void switchVolumeDown() {
        radio.setCurrentVolume(5);
        radio.switchVolumeDown();
        assertEquals(4, radio.currentVolume);
    }

    @Test
    void switchChannelFromMaxToMix() {
        radio.setCurrentChannel(9);
        radio.switchChannelUp();
        assertEquals(0, radio.currentChannel);
    }

    @Test
    void switchChannelFromMinToMax() {
        radio.switchChannelDown();
        assertEquals(9, radio.currentChannel);
    }

    @Test
    void switchVolumeFromMinToMax() {
        radio.switchVolumeDown();
        assertEquals(0, radio.currentVolume);
    }

    @Test
    void switchVolumeFromMaxToMin() {
        radio.setCurrentVolume(10);
        radio.switchVolumeUp();
        assertEquals(10, radio.currentVolume);
    }

    @Test
    void branchesChannelMax() {
        radio.setCurrentChannel(10);
        assertEquals(0, radio.currentChannel);
    }

    @Test
    void branchesChannelMin() {
        radio.setCurrentChannel(-2);
        radio.switchChannelDown();
        assertEquals(9, radio.currentChannel);
    }

    @Test
    void branchesVolumeMin() {
        radio.setCurrentVolume(-2);
        radio.switchVolumeDown();
        assertEquals(0, radio.currentVolume);
    }

    @Test
    void branchesVolumeMax() {
        radio.setCurrentVolume(10);
        radio.switchVolumeUp();
        assertEquals(10, radio.currentVolume);
    }


}