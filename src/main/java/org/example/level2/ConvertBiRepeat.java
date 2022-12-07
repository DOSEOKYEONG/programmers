package org.example.level2;

public class ConvertBiRepeat {
    // https://school.programmers.co.kr/learn/courses/30/lessons/70129
    // 이진 변환 반복하기

    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[]{0, 0};

        int calLength = 0;
        String convertResult = s;
        int countZero = 0;

        int[] cal = new int[2];
        while (!convertResult.equals("1")) {
            calLength = calLength(convertResult)[1];
            countZero = calLength(convertResult)[0];
            convertResult = Integer.toBinaryString(calLength);
            answer[0] = answer[0] + 1;
            answer[1] = answer[1] + countZero;
        }

        return answer;
    }

    public static int[] calLength(String str) {
        int[] result = new int[2];
        String filter = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i, i + 1).equals("0")) {
                filter += str.substring(i, i + 1);
            } else{
                count++;
            }
        }
        result[0] = count;
        result[1] = filter.length();

        return result;
    }
}
