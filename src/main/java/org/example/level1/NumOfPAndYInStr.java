package org.example.level1;

public class NumOfPAndYInStr {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12916
    // 문자열 내 p와 y의 개수

    boolean solution(String s) {
        boolean answer = true;
        int numOfP = 0;
        int numOfY = 0;

        String strToLowerCase = s.toLowerCase();

        for (int i = 0; i < strToLowerCase.length(); i++) {
            if (String.valueOf(strToLowerCase.charAt(i)).equals("y")) {
                numOfY++;
            } else if (String.valueOf(strToLowerCase.charAt(i)).equals("p")) {
                numOfP++;
            }
        }

        return numOfP == numOfY;
    }
}
