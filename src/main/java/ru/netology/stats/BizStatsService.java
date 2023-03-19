package ru.netology.stats;

public class BizStatsService {

    public int getMinSales(int[] sales) {
        int minSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesMonth]) {
                minSalesMonth = i;
            }
        }
        return minSalesMonth + 1;
    }

    public int getMaxSales(int[] sales) {
        int maxSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesMonth]) {
                maxSalesMonth = i;
            }
        }
        return maxSalesMonth + 1;
    }

    public int getSumSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];

        }
        return sumSales;
    }

    public int getAverageSumSales(int[] sales) {
        int averageSales = getSumSales(sales) / sales.length;
        return averageSales;
    }

    public int getAmountMonthSalesBelowAverage(int[] sales) {
        int amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSumSales(sales)) {
                amountMonth++;
            }
        }
        return amountMonth;
    }

    public int getAmountMonthSalesHigherAverage(int[] sales) {
        int amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageSumSales(sales)) {
                amountMonth++;
            }
        }
        return amountMonth;
    }
}
