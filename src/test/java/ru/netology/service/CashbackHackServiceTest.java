package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 1000 - (amount % 1000); // 1000 - 500 = 500
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected, "Остаток не совпадает");
    }

    @Test
    public void testRemainWhenAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000 - (amount % 1000); // 1000 - 0 = 1000
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected, "Остаток не совпадает");
    }

    @Test
    public void testRemainWhenAmountGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 1000 - (amount % 1000); // 1000 - 500 = 500
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected, "Остаток не совпадает");
    }
}
