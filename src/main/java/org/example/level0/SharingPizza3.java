package org.example.level0;

public class SharingPizza3 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120816
    // 피자 나눠 먹기(3)

    public int solution(int slice, int n) {
        int answer = 0;

        if( n % slice == 0){
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }

        return answer;
    }
}
