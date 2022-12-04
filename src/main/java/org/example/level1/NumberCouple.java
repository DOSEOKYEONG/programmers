package org.example.level1;
import java.util.*;

public class NumberCouple {
    // https://school.programmers.co.kr/learn/courses/30/lessons/131128
    // 숫자 짝꿍

    public String solution(String X, String Y) {
        String answer = "";

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int xCount = countChar(X, "" + i);
            int yCount = countChar(Y, "" + i);
            if (xCount > 0 && yCount > 0) {
                int length = Math.min(xCount, yCount);
                for (int k = 0; k < length; k++) {
                    stringBuilder.append(i);
                }
            }
        }

        if (stringBuilder.toString().length() > 0) {
            if (stringBuilder.toString().charAt(0) == '0') {
                answer = "0";
                return answer;
            }
            answer =stringBuilder.toString();
        } else {
            answer = "-1";
        }

        return answer;
    }

    public static int countChar(String str, String count) {
        String temp = str.replace(count, "");
        return str.length() - temp.length();
    }
}
