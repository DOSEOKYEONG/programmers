package org.example.level1;

public class CollatzConjecture {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12943
    // 콜라츠 추측

    public int solution(int num) {
        int answer = 0;

        long n = (long) num;

        if (num == 1) {
            return 0;
        }

        while (n != 1) {
            if (n % 2 == 0) {
                n = n /2;
            } else {
                n = (n * 3) + 1;
            }
            answer++;
            if (answer == 500) {
                return -1;

            }
        }
        return answer;
    }
}
