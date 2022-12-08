package org.example.level2;
import java.util.*;

public class ResqueBoat {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42885
    // 구명보트

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int index = 0;
        for (int i = people.length - 1; i >= index; i--) {
            if (people[index] + people[i] <= limit){
                answer++;
                index++;
            } else {
                answer++;
            }
        }

        return answer;
    }
}
