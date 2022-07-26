package ru.netology.stats.Dz_6_Zadanie_1_Java.services;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();
        System.out.println("1 Сумма всех продаж " + service.totalSales(service.sales));
        System.out.println("2 Сумма средних продаж " + service.averageSales(service.sales));
        System.out.println("3 Месяц с максим. продажами " + service.maxSales(service.sales));
        System.out.println("4 Месяц с мин. продажами " + service.minSales(service.sales));
        System.out.println("5 Кол-во месяцев с показателем ниже среднего " + service.lowAverageSales(service.sales));
        System.out.println("6 Кол-во месяцев с показателем выше среднего " + service.highAverageSales(service.sales));

    }
}
