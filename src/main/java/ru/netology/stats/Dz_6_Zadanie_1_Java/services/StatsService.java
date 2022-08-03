package ru.netology.stats.Dz_6_Zadanie_1_Java.services;

import java.util.Arrays;

public class StatsService {
    //long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    // 1 Метод ниже считает сумму всех продаж
    public long totalSales(long[] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = (int) (total + sales[i]);
        }
        return total;
    }

    // 2 Метод ниже считает среднюю сумму продаж в месяц
    public int averageSales(long[] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = (int) (total + sales[i]);
        }
        return (int) ((double) total / sales.length);
    }

    // 3 Метод ниже считает номер месяца максимальных продаж
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

    // 4 Метод ниже считает номер месяца минимальных продаж
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

    // 5 Метод ниже считает кол-во месяцев, в которых продажи были ниже среднего
    public int lowAverageSales(long[] sales) {
        int averageMonth = averageSales(sales);
        int month = 0;
        int count = 0;
        for (long sale : sales) {
            if (sale > averageMonth) {
                continue;
            }
            count++;
        }
        return count;
    }

    // 6 Метод ниже считает кол-во месяцев, в которых продажи были выше среднего
    public int highAverageSales(long[] sales) {
        int averageMonth = averageSales(sales);
        int month = 0;
        int count = 0;
        for (long sale : sales) {
            if (sale < averageMonth) {
                continue;
            }
            count++;
        }
        return count;
    }

}
