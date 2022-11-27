package org.example.level0;
import java.util.*;

public class MakeMax1 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120847
    // 최댓값 만들기(1)

    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        answer = numbers[numbers.length-1] * numbers[numbers.length-2];

        return answer;
    }
}
