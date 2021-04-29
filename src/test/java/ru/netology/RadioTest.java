package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    public Radio radio = new Radio(9,10);


    @Test
    void getNumberChannelMax() {
    assertEquals(9,radio.getNumberChannelMax());
    }

    @Test
    void getVolumeLevelMax() {
        assertEquals(10,radio.getVolumeLevelMax());
    }

    @Test
    void switchChannelUp() {
        radio.switchChannelUp(5);
        assertEquals(6,radio.currentChannel);
    }

    @Test
    void switchChannelDown() {
        radio.switchChannelDown(5);
        assertEquals(4,radio.currentChannel);

    }

    @Test
    void switchVolumeUp() {
        radio.switchVolumeUp(5);
        assertEquals(6,radio.currentVolume);
    }

    @Test
    void switchVolumeDown() {
        radio.switchVolumeDown(5);
        assertEquals(4,radio.currentVolume);
    }

    @Test
    void switchChannelFromMaxToMix() {
        radio.switchChannelUp(9);
        assertEquals(0,radio.currentChannel);
    }

    @Test
    void switchChannelFromMinToMax() {
        radio.switchChannelDown(0);
        assertEquals(9,radio.currentChannel);
    }

    @Test
    void switchVolumeFromMinToMax() {
        radio.switchVolumeDown(0);
        assertEquals(10,radio.currentVolume);
    }

    @Test
    void switchVolumeFromMaxToMin() {
        radio.switchVolumeUp(10);
        assertEquals(0,radio.currentVolume);
    }



    }