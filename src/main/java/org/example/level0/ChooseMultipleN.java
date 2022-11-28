package org.example.level0;
import java.util.*;

public class ChooseMultipleN {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120905
    // n의 배수 고르기

    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> numberList = new ArrayList();
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i]%n == 0){
                numberList.add(numlist[i]);
            }
        }

        answer = new int[numberList.size()];
        for(int j = 0; j < numberList.size(); j++){
            answer[j] = numberList.get(j);
        }

        return answer;
    }
}
