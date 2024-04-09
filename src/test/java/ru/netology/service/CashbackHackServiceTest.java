package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldPurchaseLessThanThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldPurchaseMoreThanThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(1_100);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldPurchaseForThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1_000);

        assertEquals(actual, expected);
    }
}