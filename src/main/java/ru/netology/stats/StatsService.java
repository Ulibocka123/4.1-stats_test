package ru.netology.stats;

public class StatsService {

    // Сумма продаж
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {

            sum += sale;
        }
        return sum;
    }

    // Средняя сумма продаж
    public long averageSalesAmount(long[] sales) {

        return calculateSum(sales) / sales.length;
    }

    // Номер месяца с самой большой продажей
    public int findMax(long[] sales) {
        long currentMax = sales[0];
        int numberMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > currentMax) {
                currentMax = sales[i];
                numberMonth = i;
            }
        }
        return numberMonth + 1;
    }

    //Номер месяца с самой маленькой продажей
    public int findMin(long[] sales) {
        long currentMin = sales[0];
        int numberMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < currentMin) {
                currentMin = sales[i];
                numberMonth = i;
            }
        }
        return numberMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int numberSalesBelowAverage(long[] sales){
        long average = calculateSum(sales) / sales.length;
        int monthsBelowAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
            monthsBelowAverage++;
        }
    }
        return monthsBelowAverage;
    }

    //Кол-во месяцев, в которых продажи были больше среднего
    public int numberSalesMoreAverage(long[] sales){
        long average = calculateSum(sales) / sales.length;
        int monthsBelowAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }
}
