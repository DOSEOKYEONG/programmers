package org.example.level2;

import java.util.*;

public class Bracket {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12909
    // 올바른 괄호

    public boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);

            if (str=='(') {
                stack.push(str);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}
