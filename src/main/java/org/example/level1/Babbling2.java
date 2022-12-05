package org.example.level1;

public class Babbling2 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/133499
    // 옹알이(2)

    public int solution(String[] babbling) {
        int answer = 0;
        String[] originalBabList = {"aya", "ye", "woo", "ma"};
        String[] repeatBabList = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String bab : babbling) {
            for (String reBab : repeatBabList) {
                bab = bab.replace(reBab, "X");
            }

            for (String orBab : originalBabList) {
                bab = bab.replace(orBab, "?");
            }

            int sign = 0;
            for (int i = 0; i < bab.length(); i++) {
                if (!bab.subSequence(i, i + 1).equals("?")) {
                    sign = 1;
                    break;
                }
            }

            if (sign == 0) {
                answer++;
            }
        }

        return answer;
    }
}
