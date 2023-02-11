package org.example.level2;

import java.util.HashSet;
import java.util.Set;

public class FindingPrimeNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42839
    // 소수 찾기

    String[] arr;
    boolean[] visit;
    Set<Integer> primeNumber;

    public int solution(String numbers) {
        int answer = 0;
        this.primeNumber = new HashSet<>();
        this.arr = new String[numbers.length()];
        this.visit = new boolean[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = String.valueOf(numbers.charAt(i));
            visit[i] = false;
        }

        dfs("");

        answer = primeNumber.size();
        System.out.println(answer);

        return answer;
    }

    public void dfs(String str) {
        if (str.length() > 0) {
            int num = Integer.parseInt(str);
            if (isPrimeNumber(num)) {
                primeNumber.add(num);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(str + arr[i]);
                visit[i] = false;
            }
        }

    }

    public Boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int end = (int) Math.sqrt(num);
        for (int i = 2; i <= end; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
