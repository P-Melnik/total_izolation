package pmelnik.local.leetcode_easy;

/**
 * Используем подход "скользящего окна" с одним проходом.
 * Отслеживаем минимальную цену покупки и максимальную прибыль на каждом шаге.
 * Анализ сложности
 * Время: O(n) - один проход по массиву
 * Память: O(1) - только константная дополнительная память
 */
public class BestTimeToBuyAndSellStockNum121 {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int  price : prices) {

            if (price < minPrice) {
                minPrice = price;
            }

            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;

    }
}
