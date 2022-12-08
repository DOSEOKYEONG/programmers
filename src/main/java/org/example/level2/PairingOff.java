package org.example.level2;
import java.util.*;

public class PairingOff {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12973
    // 짝지어 제거하기

    public int solution(String s)
    {
        int answer = -1;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            stack.add(a);

            if (stack.size() >= 2) {
                if (stack.get(stack.size() - 2) == stack.get(stack.size() - 1)) {
                    stack.pop();
                    stack.pop();
                }
            }
        }

        if (stack.size() > 0) {
            answer = 0;
        } else {
            answer = 1;
        }

        return answer;
    }
}
