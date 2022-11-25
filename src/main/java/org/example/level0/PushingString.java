package org.example.level0;

public class PushingString {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120921
    // 문자열 밀기
    public int solution(String A, String B) {
        int answer = -1;
        String result = "";

        if (A.equals(B)) {
            return 0;
        }

        for(int i = 1; i < A.length(); i++){
            String a = A.substring(A.length() - i);
            String b = A.substring(0, A.length() - i);
            result = a + b;
            if (result.equals(B)){
                return i;
            }
        }

        return answer;
    }
}
