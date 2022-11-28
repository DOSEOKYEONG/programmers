package org.example.level0;
import java.util.*;

public class FindDivisor {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120897
    // 약수 구하기

    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> numList = new ArrayList();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                numList.add(i);
            }
        }

        answer = new int[numList.size()];

        for(int i = 0; i < numList.size(); i++){
            answer[i] = numList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
