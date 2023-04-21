package ru.netology.service;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void testRemain() {
        int actual = service.remain(1300);
        int expected = 700;
        assertEquals(actual, expected);

    }
}