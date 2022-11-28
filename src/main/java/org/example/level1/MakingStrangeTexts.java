package org.example.level1;

public class MakingStrangeTexts {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12930
    // 이상한 문자 만들기

    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ", -1);
        for (int j = 0; j < strArray.length; j++) {
            String str = strArray[j];
            for (int i = 0; i < str.length(); i++) {
                if (str.equals("")){
                    answer += " ";
                } else {
                    if (i % 2 == 0) {
                        answer += String.valueOf(str.charAt(i)).toUpperCase();
                    } else {
                        answer += String.valueOf(str.charAt(i)).toLowerCase();
                    }
                }
            }
            if (j != strArray.length - 1) {
                answer += " ";
            }
        }
        return answer;
    }
}
