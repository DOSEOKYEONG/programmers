package org.example.level0;

public class AddHidingNum1 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120851
    // 숨어있는 숫자의 덧셈 (1)

    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (String.valueOf(my_string.charAt(i)).equals("0") ||
                    String.valueOf(my_string.charAt(i)).equals("1") ||
                    String.valueOf(my_string.charAt(i)).equals("2") ||
                    String.valueOf(my_string.charAt(i)).equals("3") ||
                    String.valueOf(my_string.charAt(i)).equals("4") ||
                    String.valueOf(my_string.charAt(i)).equals("5") ||
                    String.valueOf(my_string.charAt(i)).equals("6") ||
                    String.valueOf(my_string.charAt(i)).equals("7") ||
                    String.valueOf(my_string.charAt(i)).equals("8") ||
                    String.valueOf(my_string.charAt(i)).equals("9")
            ){
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }

        }

        return answer;
    }
}
