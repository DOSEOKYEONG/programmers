package org.example.level1;
import java.util.*;

public class StringSplit {
    // https://school.programmers.co.kr/learn/courses/30/lessons/140108
    // 문자열 나누기

    public int solution(String s) {
        int answer = 0;
        ArrayList<String> arrayList = new ArrayList<>();

        String str = "";

        String x = s.substring(0, 1);
        int xCount = 0;

        String other;
        int otherCount = 0;


        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(x)) {
                xCount++;
                str += s.substring(i, i + 1);
            } else {
                otherCount++;
                str += s.substring(i, i + 1);
            }

            if (i == s.length() - 1) {
                arrayList.add(str);
            } else {
                if (xCount == otherCount) {
                    arrayList.add(str);
                    xCount = 0;
                    otherCount = 0;
                    str = "";
                    if (i + 2 < s.length()) {
                        x = s.substring(i + 1, i + 2);
                    }
                } else if (xCount < otherCount){
                    arrayList.add(str);
                }
            }
        }

        answer = arrayList.size();
        return answer;
    }
}