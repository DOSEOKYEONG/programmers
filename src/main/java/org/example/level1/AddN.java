package org.example.level1;
import java.util.*;

public class AddN {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12931
    // 자릿수 더하기

    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < String.valueOf(n).length(); i++){
            answer += Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
        }

        return answer;
    }
}
