package org.example.level2;

import java.util.Arrays;

public class TriAngleSnail {
    // https://school.programmers.co.kr/learn/courses/30/lessons/68645
    // 삼각 달팽이

    public int[] solution(int n) {
        int[] answer = {};

        int[][] snail = new int[n][n];
        int last = 0;
        for (int i = 1; i <= n; i++) {
            last += i;
        }
        answer = new int[last];

        int num = 1;
        int x = -1;
        int y = 0;
        String path = "down";
        int count = 0;

        while (num <= last) {
            if (path.equals("down")) {
                x++;
                snail[x][y] = num;
                num++;
                count++;
                if (count == n) {
                    n--;
                    path = "right";
                    count = 0;
                }
            } else if (path.equals("right")) {
                y++;
                snail[x][y] = num;
                num++;
                count++;
                if (count == n) {
                    n--;
                    path = "up";
                    count = 0;
                }
            } else if (path.equals("up")) {
                x--;
                y--;
                snail[x][y] = num;
                num++;
                count++;
                if (count == n) {
                    n--;
                    path = "down";
                    count = 0;
                }
            }
        }

        int index = 0;
        for (int i = 0; i < snail.length; i++) {
            for (int j = 0; j < snail.length; j++) {
                if (snail[i][j] != 0) {
                    answer[index] = snail[i][j];
                    index++;
                }
            }
        }

        return answer;
    }
}
