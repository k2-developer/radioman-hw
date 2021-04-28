package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    public int currentChannel;
    int numberChannelMin = 0;
    int numberChannelMax = 9;
    int volumeLevelMin = 0;
    int volumeLevelMax = 10;

    @Test
    void getNumberChannelMin() {
        Radio radio1 = new Radio();
        int expected = 0;
        currentChannel = radio1.getNumberChannelMin();
        assertEquals(expected,currentChannel);
    }

    @Test
    void setNumberChannelMin() {
        Radio radio11 = new Radio();
        currentChannel = radio11.getNumberChannelMin();
        int expected = 0;
        assertEquals(expected,currentChannel);

    }

    @Test
    void getNumberChannelMax() {
        Radio radio2 = new Radio();
        int expected = 9;
        currentChannel = radio2.getNumberChannelMax();
        assertEquals(expected,currentChannel);
    }

    @Test
    void setNumberChannelMax() {
        Radio radio22 = new Radio();
        int currentChannel = 0;
        int expected = 9;
        assertEquals(expected,currentChannel);
    }

    @Test
    void getVolumeLevelMin() {
    }

    @Test
    void setVolumeLevelMin() {
    }

    @Test
    void getVolumeLevelMax() {
    }

    @Test
    void setVolumeLevelMax() {
    }
}