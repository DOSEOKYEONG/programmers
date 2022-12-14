package org.example.level2;
import java.util.*;

public class BracketTurn {
    // https://school.programmers.co.kr/learn/courses/30/lessons/76502
    // 괄호 회전하기

    public int solution(String s) {
        int answer = -1;
        answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == ')'){
                    if (stack.contains('(')) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c == ']') {
                    if (stack.contains('[')) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c == '}') {
                    if (stack.contains('{')) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }
            }
            if (stack.size() == 0) {
                answer++;
            }
        }

        return answer;
    }
}
