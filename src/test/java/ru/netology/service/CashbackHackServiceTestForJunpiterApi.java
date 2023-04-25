package ru.netology.service;

import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTestForJunpiterApi {
    CashbackHackService service = new CashbackHackService();
    @org.junit.jupiter.api.Test
    public void remainFor1() {
        Assertions.assertEquals(999, service.remain(1));
    }

    @org.junit.jupiter.api.Test
    public void remainFor0() {
        Assertions.assertEquals(1000, service.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void remainFor1001() {
        Assertions.assertEquals(999, service.remain(1001));
    }


    @org.junit.jupiter.api.Test
    public void remainFor1000() {
        Assertions.assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void remainFor999() {
        Assertions.assertEquals(1, service.remain(999));
    }
}
