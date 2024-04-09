package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldPurchaseLessThanThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPurchaseMoreThanThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(1_100);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPurchaseForThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1_000);

        assertEquals(expected, actual);
    }
}