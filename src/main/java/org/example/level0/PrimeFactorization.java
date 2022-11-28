package org.example.level0;
import java.util.*;

public class PrimeFactorization {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120852
    // 소인수분해

    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if(n % i == 0){
                    if (!arrayList.contains(i)) {
                        arrayList.add(i);
                    }
                    n = n / i;
                    break;
                }
            }
        }

        answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
