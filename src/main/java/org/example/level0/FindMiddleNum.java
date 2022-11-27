package org.example.level0;
import java.util.*;

public class FindMiddleNum {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120811
    // 중앙값 구하기

    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length / 2];
        return answer;
    }
}
