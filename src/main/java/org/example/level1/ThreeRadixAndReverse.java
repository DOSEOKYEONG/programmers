package org.example.level1;

public class ThreeRadixAndReverse {
    // https://school.programmers.co.kr/learn/courses/30/lessons/68935
    // 3진법 뒤집기

    public int solution(int n) {
        int answer = 0;
        String result = "";

        while (n > 0) {
            result += n % 3;
            n = n / 3;
        }

        answer = Integer.parseInt(result, 3);

        return answer;
    }
}
