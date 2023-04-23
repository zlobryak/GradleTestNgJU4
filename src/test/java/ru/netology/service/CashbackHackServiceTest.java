package ru.netology.service;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void testRemainFor1001() {
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testRemainFor1() {
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testRemainFor999() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testRemainFor1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);

    }    @org.testng.annotations.Test
    public void testRemainFro0() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);

    }

}