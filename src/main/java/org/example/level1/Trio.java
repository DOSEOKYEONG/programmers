package org.example.level1;

public class Trio {
    // https://school.programmers.co.kr/learn/courses/30/lessons/131705
    // 삼총사

    public int solution(int[] number) {
        int answer = 0;
        int total = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length ; k++) {
                    total = total + number[i] + number[j] + number[k];
                    if (total == 0) {
                        answer++;
                    }
                    total = 0;
                }
            }
        }
        return answer;
    }
}
