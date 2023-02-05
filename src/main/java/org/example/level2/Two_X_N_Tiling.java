package org.example.level2;

public class Two_X_N_Tiling {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12900
    // 2 x n 타일링

    public int solution(int n) {
        int answer = 0;

        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= n; i++){
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        }

        return arr[n];
    }
    public int combination(int m, int n){
        if (m == n){
            return 1;
        }

        if (n == 0){
            return 1;
        }

        if (n == 1){
            return m;
        }

        int up = 1;
        int down = 1;

        for(int i = 0; i < n; i++){
            up = up * m;
            m--;
        }

        for (;n > 1; n--){
            down = down * n;
        }

        return up / down;
    }
}
