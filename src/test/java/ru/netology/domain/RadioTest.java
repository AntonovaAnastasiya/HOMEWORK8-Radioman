package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio (9, 0, 5, 25, 100, 0);

    @Test
    public void shouldUseRadio() {
        Radio radio = new Radio(9, 0, 7, 38, 100, 0);

        assertEquals(7, radio.getCurrentChanel());
    }

    @Test
    public void shouldUseRadio2() {
        Radio radio = new Radio(9, 0, 9, 100, 100, 0);


        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldUseRadio4() {
        Radio radio = new Radio(9, 0, 8, 100, 100, 0);


        assertEquals(8, radio.getCurrentChanel());
    }

    @Test
    public void shouldUseRadio5() {
        Radio radio = new Radio(9, 0, 10, 100, 100, 0);


        assertEquals(9, radio.getMaxChanel());
    }

    @Test
    public void nextChanel() {
        Radio radio = new Radio(9, 0, 7, 38, 100, 0);
        radio.nextChanel();

        assertEquals(8, radio.getCurrentChanel());
    }

    @Test
    public void nextChanel2() {
        Radio radio = new Radio(9, 0, 0, 38, 100, 0);
        radio.nextChanel();

        assertEquals(1, radio.getCurrentChanel());
    }

    @Test
    public void nextChanel3() {
        Radio radio = new Radio(9, 0, 1, 38, 100, 0);
        radio.nextChanel();

        assertEquals(2, radio.getCurrentChanel());
    }

    @Test
    public void nextChanel4() {
        Radio radio = new Radio(9, 0, 8, 38, 100, 0);
        radio.nextChanel();

        assertEquals(9, radio.getCurrentChanel());
    }

    @Test
    public void nextChanel5() {
        Radio radio = new Radio(9, 0, 9, 38, 100, 0);
        radio.nextChanel();

        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    public void prevChanel() {
        Radio radio = new Radio(9, 0, 7, 38, 100, 0);
        radio.prevChanel();

        assertEquals(6, radio.getCurrentChanel());
    }

    @Test
    public void prevChanel2() {
        Radio radio = new Radio(9, 0, 1, 38, 100, 0);
        radio.prevChanel();

        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    public void prevChanel3() {
        Radio radio = new Radio(9, 0, 0, 38, 100, 0);
        radio.prevChanel();

        assertEquals(9, radio.getCurrentChanel());
    }

    @Test
    public void prevChanel4() {
        Radio radio = new Radio(9, 0, 9, 38, 100, 0);
        radio.prevChanel();

        assertEquals(8, radio.getCurrentChanel());
    }

    @Test
    public void prevChanel5() {
        Radio radio = new Radio(9, 0, 0, 38, 100, 0);
        radio.prevChanel();

        assertEquals(9, radio.getCurrentChanel());
    }

    @Test
    public void afterMinChanel() {
        Radio radio = new Radio(9, 0, 7, 38, 100, 0);

        assertEquals(9, radio.getMaxChanel());
    }

    @Test
    public void afterMaxChanel() {
        Radio radio = new Radio(9, 0, 7, 38, 100, 0);

        assertEquals(0, radio.getMinChanel());
    }

    @Test
    public void afterMaxVolume() {
        Radio radio = new Radio(9, 0, 7, 38, 100, 0);

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void beforeMinVolume() {
        Radio radio = new Radio(9, 0, 7, 38, 100, 0);

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setIncreaseVolume() {
        Radio radio = new Radio(9, 0, 7, 0, 100, 0);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void setIncreaseVolume2() {
        Radio radio = new Radio(9, 0, 7, 1, 100, 0);
        radio.increaseVolume();

        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void setIncreaseVolume3() {
        Radio radio = new Radio(9, 0, 7, 38, 100, 0);
        radio.increaseVolume();

        assertEquals(39, radio.getCurrentVolume());
    }

    @Test
    public void setIncreaseVolume4() {
        Radio radio = new Radio(9, 0, 7, 99, 100, 0);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setIncreaseVolume5() {
        Radio radio = new Radio(9, 0, 7, 100, 100, 0);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setLowerVolume() {
        Radio radio = new Radio(9, 0, 7, 99, 100, 0);
        radio.lowerVolume();

        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void setLowerVolume2() {
        Radio radio = new Radio(9, 0, 7, 100, 100, 0);
        radio.lowerVolume();

        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void setLowerVolume3() {
        Radio radio = new Radio(9, 0, 7, 0, 100, 0);
        radio.lowerVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setLowerVolume4() {
        Radio radio = new Radio(9, 0, 7, 1, 100, 0);
        radio.lowerVolume();

        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void setMinVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.setMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setMaxChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.setMaxChanel(9);

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setMinChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.setMinChanel(0);

        int expected = 0;
        int actual = radio.getCurrentChanel();

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
        radio.setCurrentChanel(-1);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }
}

