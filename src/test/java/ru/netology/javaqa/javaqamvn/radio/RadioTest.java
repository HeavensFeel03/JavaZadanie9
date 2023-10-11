package ru.netology.javaqa.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio rad = new Radio();

    @Test
    public void shouldSelectStationHigher() {

        rad.setNumberStation(rad.getMaxNumberStation() + 1);

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectStationBelow() {

        rad.setNumberStation(-1);

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectNextStationHigher() {

        rad.setNumberStation(rad.getMaxNumberStation());

        rad.nextStation();

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectNextStation() {

        rad.setNumberStation(rad.getMaxNumberStation() - 1);

        rad.nextStation();

        int expected = rad.getMaxNumberStation();
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectPrevStation0() {

        rad.setNumberStation(0);

        rad.prevStation();

        int expected = rad.getMaxNumberStation();
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectPrevStation() {

        rad.setNumberStation(1);

        rad.prevStation();

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectVolume101() {

        rad.setVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectVolumeMinus1() {

        rad.setVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume99() {

        rad.setVolume(99);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume100() {

        rad.setVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolume0() {

        rad.setVolume(0);

        rad.lowerVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolume1() {

        rad.setVolume(1);

        rad.lowerVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
