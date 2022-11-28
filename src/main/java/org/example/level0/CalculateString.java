package org.example.level0;

public class CalculateString {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120902
    // 문자열 계산하기

    public int solution(String my_string) {
        int answer = 0;

        String[] numbers = my_string.split(" ");

        answer += Integer.parseInt(numbers[0]);
        for(int i = 1; i < numbers.length - 1; i++){
            if(i % 2 == 1) {
                if (numbers[i].equals("+")) {
                    answer += Integer.parseInt(numbers[i + 1]);
                    i++;
                } else {
                    answer -= Integer.parseInt(numbers[i + 1]);
                    i++;
                }
            }
        }
        return answer;
    }
}
