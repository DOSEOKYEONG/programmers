package org.example.level0;

public class CuttingAndSaveArray {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120913
    // 잘라서 배열로 저장하기

    public String[] solution(String my_str, int n) {
        String[] answer = {};
        if (my_str.length() % n > 0){
            answer = new String[my_str.length() / n + 1];
        } else {
            answer = new String[my_str.length() / n];
        }

        for (int i = 0; i < answer.length; i++) {
            if (i == answer.length - 1){
                String bits = my_str.substring(i * n);
                answer[i] = bits;
            } else {
                String bits = my_str.substring(i * n, (i * n) + n);
                answer[i] = bits;
            }
        }

        return answer;
    }
}
