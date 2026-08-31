// Leetcode 1672 - Richest Customer Wealth

public class MaxWealth {
    public static void main(String[] args) {
        
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {5, 6, 7, 8}
        };

        MaxWealth obj = new MaxWealth();

        System.out.println(obj.maximumWealth(accounts));
    }
    
    public int maximumWealth(int[][] accounts) {
        // person = row , account = col
        int ans = Integer.MIN_VALUE;
        for (int[] acc : accounts) {
            int sum = 0;
            for (int anInt : acc) {
                sum += anInt;
            }
            // Now we have sum of accounts of person

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
