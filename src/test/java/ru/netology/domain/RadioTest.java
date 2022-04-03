package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldGetCurrentChanel() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    public void shouldGetCurrentChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);

        assertEquals(9, radio.getCurrentChanel());
    }

    @Test
    public void shouldGetCurrentChanel3() {
        Radio radio = new Radio();
        radio.setCurrentChanel(1);

        assertEquals(1, radio.getCurrentChanel());
    }

    @Test
    public void shouldGetCurrentChanel4() {
        Radio radio = new Radio();
        radio.setCurrentChanel(11);

        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    public void shouldGetCurrentChanel5() {
        Radio radio = new Radio();
        radio.setCurrentChanel(-1);

        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    public void shouldGetMaxVolume() {
        Radio radio = new Radio();

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetMaxChanel() {
        Radio radio = new Radio();
        radio.setMaxChanel(9);

        assertEquals(9, radio.getMaxChanel());
    }


    @Test
    public void nextChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(7);
        radio.nextChanel();

        assertEquals(8, radio.getCurrentChanel());
    }

    @Test
    public void nextChanelAfterMin() {
        Radio radio = new Radio();
        radio.setMaxChanel(9);
        radio.nextChanel();

        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    public void nextChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(1);
        radio.nextChanel();

        assertEquals(2, radio.getCurrentChanel());
    }

    @Test
    public void nextChanel3() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);
        radio.nextChanel();

        assertEquals(9, radio.getCurrentChanel());
    }

    @Test
    public void nextChanel4() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.nextChanel();

        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    public void prevChanel() {
        Radio radio = new Radio();
        radio.setCurrentChanel(7);
        radio.prevChanel();

        assertEquals(6, radio.getCurrentChanel());
    }

    @Test
    public void prevChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.prevChanel();

        assertEquals(8, radio.getCurrentChanel());
    }

    @Test
    public void prevChanelAfterMin() {
        Radio radio = new Radio();
        radio.setMinChanel(0);
        radio.prevChanel();

        assertEquals(9, radio.getCurrentChanel());
    }

    @Test
    public void nextChanelAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);

        assertEquals(0, radio.getMinChanel());
    }

    @Test
    public void afterMaxVolume() {
        Radio radio = new Radio();

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void beforeMinVolume() {
        Radio radio = new Radio();

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setIncreaseVolume() {
        Radio radio = new Radio();
        radio.setMinVolume();
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void setIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();

        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void setIncreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void setLowerVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.lowerVolume();

        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void setLowerVolume2() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        radio.lowerVolume();

        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void setLowerVolume3() {
        Radio radio = new Radio();
        radio.lowerVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMinVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setVolumeAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.setMaxVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setMaxChanel2() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);

        assertEquals(9, radio.getCurrentChanel());
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
    public void shouldCreateRadioWithInputChannels() {
        Radio radio = new Radio(22);

        assertEquals(21, radio.getCurrentChanel());
    }

    @Test
    public void shouldGetRadioWithDefaultChannels() {
        Radio radio = new Radio();
        radio.setNumberCurrentChanel(10);


        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    public void shouldGetRadioWithInputChannels2() {
        Radio radio = new Radio(1);

        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    public void shouldGetRadioWithInputChannels3() {
        Radio radio = new Radio();
        radio.setNumberCurrentChanel(7);

        assertEquals(7, radio.getCurrentChanel());
    }
}

