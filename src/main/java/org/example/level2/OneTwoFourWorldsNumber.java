package org.example.level2;

public class OneTwoFourWorldsNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12899
    // 124 나라의 숫자

    StringBuilder sb;

    public String solution(int n) {
        this.sb = new StringBuilder();
        String answer = "";
        convert124(n);

        answer = sb.toString();
        return answer;
    }

    public void convert124(int num) {

        if (num == 1) {
            sb.append(1);
        } else if (num == 2){
            sb.append(2);
        } else if (num == 3) {
            sb.append(4);
        } else {
            if (num % 3 == 0) {
                convert124((num / 3) - 1);
                convert124(num - (3 * ((num / 3) - 1)));
            }else {
                convert124(num / 3);
                convert124(num % 3);
            }
        }
    }
}
