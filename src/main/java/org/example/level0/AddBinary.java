package org.example.level0;

public class AddBinary {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120885
    // 이진수 더하기

    public String solution(String bin1, String bin2) {
        long newValue = Long.parseLong(bin1, 2) + Long.parseLong(bin2, 2);

        return Long.toBinaryString(newValue);
    }
}
