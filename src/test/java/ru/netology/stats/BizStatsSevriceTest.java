package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BizStatsSevriceTest {

    @Test
    public void minMonthSalesDay() {
        BizStatsService service = new BizStatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.getMinSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void maxMonthSalesDay() {
        BizStatsService service = new BizStatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.getMaxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void sumBizSales() {
        BizStatsService service = new BizStatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSell = 180;
        int actualSell = service.getSumSales(sales);

        Assertions.assertEquals(expectedSell, actualSell);
    }

    @Test
    public void averageBizSales() {
        BizStatsService service = new BizStatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.getAverageSumSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void amountBelowAverage() {
        BizStatsService service = new BizStatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.getAmountMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void amountHigherAverage() {
        BizStatsService service = new BizStatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSell = 5;
        int actualSell = service.getAmountMonthSalesHigherAverage(sales);

        Assertions.assertEquals(expectedSell, actualSell);
    }
}
