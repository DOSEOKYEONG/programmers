package org.example.level2;

public class MakingBigNum {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42883
    // 큰 수 만들기

    public String solution(String number, int k) {

        StringBuilder sb = new StringBuilder();
        String answer = "";

        int index = 0;
        int size = number.length() - k;

        for (int i = 0; i < size; i++) {
            int max = 0;
            for (int j = index; j <= k + i; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    index = j + 1;
                }
            }
            sb.append(max);
        }

        answer = sb.toString();
        System.out.println(answer);

        return answer;
    }
}
