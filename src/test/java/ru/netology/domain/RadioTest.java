package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.increaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.lowerVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.lowerVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(10);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChanel3() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);

        int expected = 8;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChanel4() {
        Radio radio = new Radio();
        radio.setCurrentChanel(-1);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.setToMaxChanel();

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMinChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.setToMinChanel();

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void nextChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(5);

        radio.nextChanel();

        int expected = 6;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void nextChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(10);
        radio.nextChanel();

        int expected = 1;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void nextChanel3() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.nextChanel();

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void nextChanel4() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);
        radio.nextChanel();

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void prevChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(4);

        radio.prevChanel();

        int expected = 3;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void prevChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.prevChanel();

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void prevChanel3() {
        Radio radio = new Radio();
        radio.setCurrentChanel(1);
        radio.prevChanel();

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }
}

