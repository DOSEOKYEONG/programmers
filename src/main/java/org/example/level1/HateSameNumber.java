package org.example.level1;
import java.util.*;
public class HateSameNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12906
    // 같은 숫자는 싫어

    public int[] solution(int []arr) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);
        int arrayListIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arrayList.get(arrayListIndex)) {
                arrayList.add(arr[i]);
                arrayListIndex++;
            }
        }

        answer = new int[arrayList.size()];

        int index = 0;
        for (Integer a : arrayList) {
            answer[index] = a;
            index++;
        }

        return answer;
    }
}
