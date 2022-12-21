package org.example.level2;

public class Fatigue {
    // https://school.programmers.co.kr/learn/courses/30/lessons/87946
    // 피로도

    int answer;
    boolean[] visit;

    public int solution(int k, int[][] dungeons) {
        this.answer = 0;
        visit = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }

    public void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (dungeons[i][0] <= k && !visit[i]) {
                visit[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }

        answer = Math.max(depth, answer);
    }
}
