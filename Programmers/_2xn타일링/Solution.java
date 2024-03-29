package _2xn타일링;

import java.util.stream.IntStream;

class Solution {

    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        IntStream.range(3, n + 1)
            .forEach(i -> dp[i] = (dp[i - 2] + dp[i - 1]) % 1_000_000_007);

        return dp[n];
    }
}