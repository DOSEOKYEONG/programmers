package org.example.level1;
import java.util.*;

public class RemoveMinNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12935
    // 제일 작은 수 제거하기

    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();

        int[] arrCopy = arr.clone();

        Arrays.sort(arrCopy);

        int min = arrCopy[0];
        for (Integer num : arr){
            if (num > min) {
                arrayList.add(num);
            }
        }
        if (arrayList.size() > 0) {
            answer = new int[arrayList.size()];
            int index = 0;
            for (Integer overNums : arrayList) {
                answer[index] = overNums;
                index++;
            }
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }
}
