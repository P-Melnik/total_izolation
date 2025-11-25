package pmelnik.local.leetcode_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockNum121Test {

    BestTimeToBuyAndSellStockNum121 sut = new BestTimeToBuyAndSellStockNum121();

    @Test
    void maxProfit() {
        int[] prices = {7,1,5,3,6,4};

        int res = sut.maxProfit(prices);

        assertEquals(5, res);
    }
}