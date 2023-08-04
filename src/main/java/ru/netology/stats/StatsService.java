package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long totalSales(long[] sales) {
        long totalSale = 0;
        for (long t : sales) {
            totalSale += t;
        }
        return totalSale;

    }

    public long averageSale(long[] sales) {
        return totalSales(sales) / sales.length;
    }

    public int monthsWhenSalesBelowAverage(long[] sales) {
        long averageSale = averageSale(sales);
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsWhenSalesAboveAverage(long[] sales) {
        long averageSale = averageSale(sales);
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}