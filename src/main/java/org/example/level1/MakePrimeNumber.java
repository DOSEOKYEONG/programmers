package org.example.level1;

public class MakePrimeNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12977
    // 소수 만들기

    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if (isPrimeNumber(num)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    boolean isPrimeNumber(int x) {
        int end = (int) Math.sqrt(x);
        for (int i = 2; i <= end; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
