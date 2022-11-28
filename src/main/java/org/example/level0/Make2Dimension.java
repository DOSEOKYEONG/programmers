package org.example.level0;

public class Make2Dimension {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120842
    // 2차원으로 만들기

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int y = num_list.length / n;
        answer = new int[y][n];

        for(int i = 0; i < y; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = num_list[(n * i) + j];
            }
        }

        return answer;
    }
}
