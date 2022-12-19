package org.example.level2;

public class FindPrimeNumFromK {
    // https://school.programmers.co.kr/learn/courses/30/lessons/92335
    // k진수에서 소수 개수 구하기

    public int solution(int n, int k) {
        int answer = 0;

        String NToKConvert = Integer.toString(n, k);
        String[] strArray = NToKConvert.split("0");

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > 0) {
                long num = Long.parseLong(strArray[i]);
                if (num > 1) {
                    if (isPrimeNumber(num)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    boolean isPrimeNumber(long x) {
        int end = (int) Math.sqrt(x);
        for (int i = 2; i <= end; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}