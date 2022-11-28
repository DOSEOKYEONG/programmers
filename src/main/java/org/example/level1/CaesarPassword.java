package org.example.level1;

public class CaesarPassword {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12926
    // 시저 암호

    public String solution(String s, int n) {
        String answer = "";
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = upperAlphabet.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ")) {
                answer += " ";
            } else {
                if (upperAlphabet.contains(String.valueOf(s.charAt(i)))) {
                    int index = upperAlphabet.indexOf(String.valueOf(s.charAt(i)));
                    answer += upperAlphabet.charAt((index + n) % upperAlphabet.length());
                } else {
                    int index = lowerAlphabet.indexOf(String.valueOf(s.charAt(i)));
                    answer += lowerAlphabet.charAt((index + n) % lowerAlphabet.length());
                }
            }
        }
        return answer;
    }
}
