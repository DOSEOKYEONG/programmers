package org.example.level0;

public class FindCompositeNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120846
    // 합성수 찾기

    public int solution(int n) {
        int answer = 0;
        int num = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    num++;
                }
            }
            if(num >= 3){
                answer++;
            }
            num = 0;
        }
        return answer;
    }
}
