package org.example.level0;
import java.util.*;

public class MakeBWithA {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120886
    // A로 B만들기

    public int solution(String before, String after) {
        int answer = 0;

        String[] beforeArray = before.split("");
        String[] afterArray = after.split("");

        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);

        String sortBefore = "";
        String sortAfter = "";

        for (int i = 0; i < beforeArray.length; i++) {
            sortBefore += beforeArray[i];
            sortAfter += afterArray[i];
        }

        if (sortBefore.equals(sortAfter)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}
