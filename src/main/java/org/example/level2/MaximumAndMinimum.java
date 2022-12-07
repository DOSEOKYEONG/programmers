package org.example.level2;
import java.util.*;

public class MaximumAndMinimum {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12939
    // 최댓값과 최솟값
    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(String str : strArray){
            arrayList.add(Integer.parseInt(str));
        }

        Collections.sort(arrayList);
        answer += arrayList.get(0) + " ";
        answer += arrayList.get(arrayList.size() - 1);
        return answer;
    }
}
