package org.example.level0;

public class EvenOrOddNums {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120824
    // 짝수 홀수 개수

    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[2];
        int even = 0;
        int odd = 0;

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i]%2==0){
                even++;
            } else{
                odd++;
            }
        }
        answer[0] = even;
        answer[1] = odd;

        return answer;
    }
}
