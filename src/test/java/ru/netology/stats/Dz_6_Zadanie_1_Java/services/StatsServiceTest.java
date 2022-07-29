package ru.netology.stats.Dz_6_Zadanie_1_Java.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test //1 Сумма всех продаж
    public void shouldFindTotalsales() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.totalSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test // 2 Сумма средних продаж
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test //3 Месяц с максим. продажами
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test //4 Месяц с мин. продажами
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test //5 Кол-во месяцев с показателем ниже среднего
    public void shouldFindLowAverageSales() {
        StatsService service = new StatsService();

        int expected = 7;
        int actual = service.lowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test //6 Кол-во месяцев с показателем выше среднего
    public void shouldFindHighAverageSales() {
        StatsService service = new StatsService();

        int expected = 7;
        int actual = service.highAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
