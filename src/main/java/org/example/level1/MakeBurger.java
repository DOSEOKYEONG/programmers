package org.example.level1;
import java.util.*;

public class MakeBurger {
    // https://school.programmers.co.kr/learn/courses/30/lessons/133502
    // 햄버거 만들기

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (Integer ing : ingredient) {
            stack.push(ing);

            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 4) ==1 &&
                        stack.get(stack.size() - 3) ==2 &&
                        stack.get(stack.size() - 2) ==3 &&
                        stack.get(stack.size() - 1) ==1){
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return answer;
    }
}
