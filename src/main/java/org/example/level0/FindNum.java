package org.example.level0;

public class FindNum {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120904
    // 숫자 찾기

    public int solution(int num, int k) {
        int answer = 0;
        answer = -1;

        for(int i = 0; i < String.valueOf(num).length(); i++){
            if(String.valueOf(String.valueOf(num).charAt(i)).equals(String.valueOf(k))){
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}
