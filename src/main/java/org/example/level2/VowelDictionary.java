package org.example.level2;

import java.util.ArrayList;

public class VowelDictionary {
    // https://school.programmers.co.kr/learn/courses/30/lessons/84512
    // 모음사전
    Character[] vowels;
    ArrayList<String> strings;
    public int solution(String word) {
        int answer;
        this.vowels = new Character[]{'A', 'E', 'I', 'O', 'U'};
        strings = new ArrayList<>();

        dfs("");

        answer = strings.indexOf(word);
        return answer;
    }

    public void dfs(String str){
        if (str.length() > 5) {
            return;
        }
        strings.add(str);
        for (int i = 0; i < 5; i++) {
            dfs(str + vowels[i]);
        }
    }
}
