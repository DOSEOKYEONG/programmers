package org.example.level2;
import java.util.*;

public class EnglishWordChainGame {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12981
    // 영어 끝말잇기

    public int[] solution(int n, String[] words) {
        int[] answer = {};
        answer = new int[2];

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(words[0]);
        boolean fail = false;
        for (int j = 1; j < words.length; j++) {
            if (!arrayList.contains(words[j]) &&
                    arrayList.get(j - 1).substring(arrayList.get(j - 1).length() - 1).equals(words[j].substring(0, 1))) {
                arrayList.add(words[j]);
            } else {
                fail = true;
                answer[0] = (j % n) + 1;
                answer[1] = (j / n) + 1;
                break;
            }
        }

        if (fail == false) {
            answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }
}
