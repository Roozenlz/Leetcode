package AUSTOJ.algorithm.homework.third;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Knapsack {
    //最大权重
    private int maxWeight = Integer.MIN_VALUE;

    public int knapsack(int[] weights, int[] values, int capacity) {
        backtrack(weights, values, capacity, 0, 0, 0);
        return maxWeight;
    }

    private void backtrack(int[] weights, int[] values, int capacity, int currentWeight, int currentValue, int index) {
        //如果当前总重量超过容量，则停止回溯。
        if (currentWeight > capacity) {
            return;
        }
        //如果已经遍历了所有物品，则更新最大权重并返回。
        if (index == weights.length) {
            maxWeight = Math.max(maxWeight, currentValue);
            return;
        }

        // 不放当前index位置的物品
        backtrack(weights, values, capacity, currentWeight, currentValue, index + 1);

        // 放当前index位置的物品
        backtrack(weights, values, capacity, currentWeight + weights[index], currentValue + values[index], index + 1);
    }
}




