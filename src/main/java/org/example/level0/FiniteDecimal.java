package org.example.level0;

import java.util.ArrayList;

public class FiniteDecimal {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120878
    // 유한소수 판별하기
    public int solution(int a, int b) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);

        // 기약분수 만들기
        for(int i = 2; i <= a; i++){
            if(a % i == 0 && b % i == 0){
                a = a / i;
                b = b / i;
            }
        }

        // 소인수분해
        while(b > 1){
            for(int j = 2; j <= b; j++){
                if(b % j == 0){
                    b = b / j;
                    if(!arrayList.contains(j)){
                        return 2;
                    }
                    break;
                }
            }
        }

        answer = 1;


        return answer;
    }
}
