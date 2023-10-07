package ru.netology.javaqa.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

   /* @Test
    public void ShouldGetNumberStation(){
        Radio rad = new Radio();

        rad.numberStation = 8;

        int expected = 8;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);


    }*/

    @Test
    public void shouldSelectStation() {
        Radio rad = new Radio();

        rad.setNumberStation(10);

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectStationMinus1() {
        Radio rad = new Radio();

        rad.setNumberStation(-1);

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectNextStation9() {
        Radio rad = new Radio();

        rad.setNumberStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSelectNextStation() {
        Radio rad = new Radio();

        rad.setNumberStation(8);

        rad.nextStation();

        int expected = 9;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectPrevStation0() {
        Radio rad = new Radio();

        rad.setNumberStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectPrevStation() {
        Radio rad = new Radio();

        rad.setNumberStation(8);

        rad.prevStation();

        int expected = 7;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectVolume101() {
        Radio rad = new Radio();

        rad.setVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSelectVolumeMinus1() {
        Radio rad = new Radio();

        rad.setVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolume99() {
        Radio rad = new Radio();

        rad.setVolume(99);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume100() {
        Radio rad = new Radio();

        rad.setVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolume0() {
        Radio rad = new Radio();

        rad.setVolume(0);

        rad.lowerVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolume1() {
        Radio rad = new Radio();

        rad.setVolume(1);

        rad.lowerVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
