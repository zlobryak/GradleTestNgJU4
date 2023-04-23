package ru.netology.service;


import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void remainFor1() {
        assertEquals(999, service.remain(1));
    }
    @org.junit.Test
    public void remainFor0() {
        assertEquals(1000, service.remain(0));
    }
    @org.junit.Test
    public void remainFor1001() {
        assertEquals(999, service.remain(1001));
    }
    @org.junit.Test
    public void remainFor1000() {
        assertEquals(0, service.remain(1000));
    }
}