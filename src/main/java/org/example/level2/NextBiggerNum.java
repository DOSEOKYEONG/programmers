package org.example.level2;

public class NextBiggerNum {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12911
    // 다음 큰 숫자

    public int solution(int n) {
        int answer = 0;
        int numOfOne = numOfOne(n);

        int num = n +1;
        while (true) {
            if (numOfOne == numOfOne(num)) {
                answer = num;
                break;
            }
            num++;
        }

        return answer;
    }

    public static int numOfOne(int num) {
        String numToBinary = Integer.toBinaryString(num);
        int count = 0;

        for (int i = 0; i < numToBinary.length(); i++) {
            if (numToBinary.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}
