package org.example.level2;

public class JumpAndWarp {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12980
    // 점프와 순간 이동

    public int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 1) {
                n = n - 1;
                ans++;
            } else {
                n = n / 2;
            }
        }

        return ans;
    }
}
