package org.example.level0;

public class HateEnglish {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120894
    // 영어가 싫어요

    public long solution(String numbers) {
        String string_num = numbers
                .replace("zero", "0")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");

        long answer = Long.parseLong(string_num);
        return answer;
    }
}
