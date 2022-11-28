package org.example.level1;

import java.util.*;

public class AddMissingNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/86051
    // 없는 숫자 더하기

    public int solution(int[] numbers) {
        int answer = -1;
        answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        for (Integer num : numbers) {
            if (arrayList.contains(num)) {
                arrayList.remove(arrayList.indexOf(num));
            }
        }

        for (Integer n : arrayList) {
            answer += n;
        }

        return answer;
    }
}
