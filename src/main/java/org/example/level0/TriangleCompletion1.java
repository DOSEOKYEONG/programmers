package org.example.level0;

import java.util.*;

public class TriangleCompletion1 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120889
    // 삼격형의 완성조건(1)
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        if(sides[2] < sides[0] + sides[1]){
            answer = 1;
        } else {
            answer = 2;
        }


        return answer;
    }

}
