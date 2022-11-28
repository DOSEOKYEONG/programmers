package org.example.level0;
import java.util.*;

public class AppearedOnlyOnce {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120896
    // 한 번만 등장한 문자

    public String solution(String s) {
        String answer = "";
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            String bits = String.valueOf(s.charAt(i));

            for (int j = 0; j < s.length(); j++) {
                if (String.valueOf(s.charAt(j)).equals(bits)) {
                    num++;
                }
            }
            if (num == 1) {
                answer += bits;
            }
            num = 0;
        }

        char[] asd = answer.toCharArray();
        Arrays.sort(asd);

        String result = "";
        for (int i = 0; i < answer.length(); i++) {
            result += asd[i];
        }

        return result;
    }
}
