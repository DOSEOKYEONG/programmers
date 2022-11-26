package org.example.level0;

public class CurseNum3 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120871
    // 저주의 숫자 3

    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++){
            answer++;
            while (String.valueOf(answer).contains("3") || answer % 3 == 0){
                answer++;
            }
        }

        return answer;
    }
}
