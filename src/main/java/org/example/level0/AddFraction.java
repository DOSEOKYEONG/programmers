package org.example.level0;

public class AddFraction {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120808
    // 분수의 덧셈

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = {};
        answer = new int[2];
        int num;

        answer[0] = denum1 * num2 + denum2 * num1;
        answer[1] = num1 * num2;
        if (answer[0] < answer[1]){
            num = gcd(answer[1], answer[0]);
            answer[0] = answer[0] / num;
            answer[1] = answer[1] / num;
        } else {
            num = gcd(answer[0], answer[1]);
            answer[0] = answer[0] / num;
            answer[1] = answer[1] / num;
        }
        return answer;
        }

    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}
