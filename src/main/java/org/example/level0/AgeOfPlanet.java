package org.example.level0;

public class AgeOfPlanet {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120834
    // 외계행성의 나이

    public String solution(int age) {
        String answer = "";
        String s = String.valueOf(age);
        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {
            answer += (char)(Integer.parseInt(arr[i]) + 97);
        }

        return answer;
    }
}
