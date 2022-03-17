package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldCalculateSum() {
        int expected = 180;
        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSalesAmount() {
        int expected = 15;
        long actual = service.averageSalesAmount(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMax() {
            int expected = 6;
            long actual = service.findMax(sales);

            assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        int expected = 9;
        long actual = service.findMin(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberSalesBelowAverage() {
        int expected = 5;
        long actual = service.numberSalesBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberSalesMoreAverage() {
        int expected = 5;
        long actual = service.numberSalesAboveAverage(sales);

        assertEquals(expected, actual);
    }
}