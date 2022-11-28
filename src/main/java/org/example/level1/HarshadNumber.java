package org.example.level1;

public class HarshadNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12947
    // 하샤드 수

    public boolean solution(int x) {
        boolean answer = true;

        int total = 0;
        for (int i = 0; i < String.valueOf(x).length(); i++){
            total += Integer.parseInt(String.valueOf(String.valueOf(x).charAt(i)));
        }

        if (x % total == 0) {
            answer = true;
        } else{
            answer = false;
        }

        return answer;
    }
}
