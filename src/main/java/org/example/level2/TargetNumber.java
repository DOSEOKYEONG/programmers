package org.example.level2;

public class TargetNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/43165
    // 타겟 넘버
    int[] numbers;
    int target;
    int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return answer;
    }

    public void dfs(int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
}
