package org.example.level0;

public class FindArraysElementalLength {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120854
    // 배열 원소의 길이

    public int[] solution(String[] strlist) {
        int[] answer = {};
        answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
