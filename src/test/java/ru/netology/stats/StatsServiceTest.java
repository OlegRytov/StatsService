package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test

    public void shouldCalcMinMonth() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test

    public void shouldCalcMaxMonth() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test

    public void shouldCalcTotal() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedTotalSale = 180;
        long actualTotalSale = service.totalSales(sales);

        Assertions.assertEquals(expectedTotalSale, actualTotalSale);
    }

    @Test

    public void shouldCalcAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSale = 15;
        long actualAverageSale = service.averageSale(sales);

        Assertions.assertEquals(expectedAverageSale, actualAverageSale);

    }

    @Test

    public void shouldCalcMonthsBelowAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsBelowAverage = 5;
        int actualMonthsBelowAverage = service.monthsWhenSalesBelowAverage(sales);
    }

    @Test

    public void shouldCalcMonthsAboveAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsAboveAverage = 5;
        int actualMonthsAboveAverage = service.monthsWhenSalesAboveAverage(sales);
    }
}