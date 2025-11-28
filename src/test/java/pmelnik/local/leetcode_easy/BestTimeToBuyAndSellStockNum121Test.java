package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockNum121Test {

    BestTimeToBuyAndSellStockNum121 sut = new BestTimeToBuyAndSellStockNum121();

    @Test
    void maxProfitFive() {
        int[] prices = {7,1,5,3,6,4};

        int res = sut.maxProfit(prices);

        assertEquals(5, res);
    }

    @Test
    void maxProfitZero() {
        int[] prices = {7,6,4,3,1};

        int res = sut.maxProfit(prices);

        assertEquals(0, res);
    }

    @Test
    void maxProfitHundred() {
        int[] prices = {15, 14, 555, 90, 73, 13, 89, 14, 99, 113, 102, 11, 111};

        int res = sut.maxProfit(prices);

        assertEquals(541, res);
    }

}