package org.example.level2;

public class EatGround {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12913
    // 땅따먹기

    int answer;
    int[][] land;

    public int solution(int[][] land) {
        this.answer = 0;
        this.land = land;

//        dfs(1, 0, land[0][0]);
//        dfs(1, 1, land[0][1]);
//        dfs(1, 2, land[0][2]);
//        dfs(1, 3, land[0][3]);

        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        return max(land[land.length - 1]);

//        return answer;
    }

    private int max(int[] ints) {
        int sum = 0;
        for (int num : ints) {
            sum = Math.max(sum, num);
        }

        return sum;
    }


    public void dfs(int depth, int index, int total) {
        if (depth == land.length) {
            answer = Math.max(total, answer);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (i != index) {
                System.out.println("total : " + total + " + " + land[depth][i]);
                dfs(depth + 1, i, total + land[depth][i]);
            }
        }
    }
}
