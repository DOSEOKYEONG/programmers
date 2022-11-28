package org.example.level1;
import java.util.*;

public class IntegerDesc {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12933
    // 정수 내림차순으로 배치하기

    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> arrayList = new ArrayList<>();

        for (int i = 0; i < String.valueOf(n).length(); i++) {
            arrayList.add(Long.parseLong(String.valueOf(String.valueOf(n).charAt(i))));
        }

        Collections.sort(arrayList, Collections.reverseOrder());

        String total = "";

        for (Long num : arrayList) {
            total += String.valueOf(num);
        }
        answer = Long.parseLong(total);

        return answer;
    }
}
