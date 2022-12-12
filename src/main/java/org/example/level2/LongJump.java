package org.example.level2;

public class LongJump {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12914
    // 멀리 뛰기

    public long solution(int n) {
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<2001; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n];
    }
}
