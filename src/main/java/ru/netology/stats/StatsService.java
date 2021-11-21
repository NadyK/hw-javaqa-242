package ru.netology.stats;

public class StatsService {
//1
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }
//2
    public int calculateAverageSales(int[] sales) {
        return calculateSum(sales) / sales.length;
    }
//3
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
            maxMonth = month;
            }
        month = month + 1;
         }
        return maxMonth + 1;
    }
//4
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
//5
    public int monthsLowerAvrg(int[] sales) {
        int monthLowerAvrg = 0;
        for (int sale : sales) {
            if ( calculateAverageSales(sales)> sale) {
                monthLowerAvrg++;
            }
        }
        return monthLowerAvrg;
    }
//6
    public int monthsUpAvrg(int[] sales) {
        int monthUpAvrg = 0;
        for (int sale : sales) {
            if ( calculateAverageSales(sales)< sale) {
                monthUpAvrg++;
            }
        }
        return monthUpAvrg;
    }
}

