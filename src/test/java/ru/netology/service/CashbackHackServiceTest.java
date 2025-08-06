package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 1000 - (amount % 1000); // 1000 - 500 = 500
        int actual = service.remain(amount);
        assertEquals("Остаток не совпадает", expected, actual);
    }

    @Test
    public void testRemainWhenAmountGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 1000 - (amount % 1000); // 1000 - 500 = 500
        int actual = service.remain(amount);
        assertEquals("Остаток не совпадает", expected, actual);
    }

    @Test
    public void testRemainWhenAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0; // Ожидаем, что остаток будет 0
        int actual = service.remain(amount);
        assertEquals("Остаток не совпадает", expected, actual);
    }
}
