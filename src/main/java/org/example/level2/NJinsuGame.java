package org.example.level2;
import java.util.*;

public class NJinsuGame {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17687
    // [3차] n진수 게임

    public String solution(int n, int t, int m, int p) {
//        진법 n, 미리 구할 숫자의 갯수 t, 게임에 참가하는 인원 m, 튜브의 순서 p 가 주어진다.
        String answer = "";
        ArrayList<Character> characters = new ArrayList<>();

        characters.add('0');
        int num = 0;
        String str;
        while (characters.size() < t * m) {
            num++;
            str = Integer.toString(num, n);
            for (int i = 0; i < str.length(); i++) {
                characters.add(str.charAt(i));
            }
        }

        for (int j = 0; j < t; j++) {
            answer += characters.get((m * j) + p - 1).toString().toUpperCase();
        }

        return answer;
    }
}
