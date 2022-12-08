package org.example.level2;

public class Nlcm {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12953
    // N개의 최소공배수

    public int solution(int[] arr) {
        int answer = 0;

        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int b = arr[i];
            if (a > b) {
                a = (a * b) / gcd(a, b);
            } else {
                a = (a * b) / gcd(b, a);
            }
        }

        answer = a;

        return answer;
    }

    public static int gcd(int a, int b) {
        if(b == 0){
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
