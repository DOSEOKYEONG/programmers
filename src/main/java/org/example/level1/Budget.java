package org.example.level1;

import java.util.*;

public class Budget {
    // https://papago.naver.com/?sk=ko&tk=en&st=%EC%98%88%EC%82%B0
    // 예산

    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;

        for (Integer n : d) {
            result += n;
        }
        if (result <= budget) {
            return d.length;
        }

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (budget - d[i] >= 0) {
                budget -= d[i];
                answer++;
            }
        }
        return answer;
    }
}
