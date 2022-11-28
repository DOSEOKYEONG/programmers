package org.example.level1;

public class MinimalRectangle {
    // https://school.programmers.co.kr/learn/courses/30/lessons/86491
    // 최소 직사각형

    public int solution(int[][] sizes) {
        int answer = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int sizeTemp0 = sizes[i][0] + 0;
                int sizeTemp1 = sizes[i][1] + 0;
                sizes[i][0] = sizeTemp1;
                sizes[i][1] = sizeTemp0;
            }
        }

        int max0 = 0;
        int max1 = 0;
        for (int[] nums : sizes) {
            if (max0 < nums[0]) {
                max0 = nums[0];
            }
            if (max1 < nums[1]) {
                max1 = nums[1];
            }
        }
        answer = max0 * max1;
        return answer;
    }
}
