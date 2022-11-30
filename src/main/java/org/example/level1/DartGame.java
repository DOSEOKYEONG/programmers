package org.example.level1;

public class DartGame {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17682
    // [1차] 다트 게임
    public int solution(String dartResult) {
        int answer = 0;

        int[] nums = new int[3];

        String numStr = "";
        int index = -1;
        for (int i = 0; i < dartResult.length(); i++) {
            char a = dartResult.charAt(i);
            if (a >= '0' && a <= '9') {
                numStr += a;
            } else {
                if (a == 'S') {
                    index++;
                    nums[index] = Integer.parseInt(numStr);
                    numStr = "";
                } else if (a == 'D') {
                    index++;
                    nums[index] = Integer.parseInt(numStr);
                    nums[index] = (int)Math.pow(nums[index], 2);
                    numStr = "";
                } else if (a == 'T') {
                    index++;
                    nums[index] = Integer.parseInt(numStr);
                    nums[index] = (int)Math.pow(nums[index], 3);
                    numStr = "";
                } else if (a == '*') {
                    if (index == 0) {
                        nums[index] = nums[index] * 2;
                    } else {
                        nums[index] = nums[index] * 2;
                        nums[index - 1] = nums[index - 1] * 2;
                    }
                } else if (a == '#'){
                    nums[index] = nums[index] * -1;
                }
            }
        }

        for (Integer numInNums : nums) {
            answer += numInNums;
        }

        return answer;
    }
}
