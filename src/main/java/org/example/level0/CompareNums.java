package org.example.level0;

public class CompareNums {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120807
    // 숫자 비교하기

    public int solution(int num1, int num2) {
        int answer = 0;

        if(num1 == num2){
            answer = 1;
        }else{
            answer = -1;
        }

        return answer;
    }
}
