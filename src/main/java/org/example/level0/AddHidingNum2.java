package org.example.level0;

public class AddHidingNum2 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120864
    // 숨어있는 숫자의 덧셈 (2)

    public int solution(String my_string) {
        int answer = 0;
        String[] nums = my_string.replaceAll("[^0-9]", " ").split(" ");

        for(int i = 0; i < nums.length; i++){
            if(nums[i].equals("")) {
                continue;
            } else {
                answer += Integer.parseInt(nums[i].trim());
            }
        }
        return answer;
    }
}
