package org.example.level1;
import java.util.*;

public class KnightsWeapons {
    // https://school.programmers.co.kr/learn/courses/30/lessons/136798
    // 기사단원의 무기

    public int solution(int number, int limit, int power) {
        int answer = 0;

        int numOfDivisor = 0;

        for (int i = 1; i <= number; i++) {
            if (i == 1) {
                numOfDivisor = 1;
            } else {
                numOfDivisor = primeFactorization(i);
            }
            if (numOfDivisor > limit) {
                numOfDivisor = power;
            }
            answer += numOfDivisor;
            numOfDivisor = 0;
        }

        return answer;
    }

    public static int primeFactorization(int num) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0) {
                if (num / i == i){
                    cnt++;
                } else{
                    cnt = cnt + 2;
                }
            }
        }
        return cnt;
    }
}
