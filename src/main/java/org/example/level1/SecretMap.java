package org.example.level1;

public class SecretMap {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17681
    // [1차] 비밀지도

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];

        for (int j = 0; j < n; j++) {
            String arr1ToStr = Integer.toBinaryString(arr1[j]);
            while (arr1ToStr.length() < n) {
                arr1ToStr = "0" + arr1ToStr;
            }
            String arr2ToStr = Integer.toBinaryString(arr2[j]);
            while (arr2ToStr.length() < n) {
                arr2ToStr = "0" + arr2ToStr;
            }
            String total = "";
            for (int i = 0; i < n; i++) {
                String arr1ToStr_bits = String.valueOf(arr1ToStr.charAt(i));
                String arr2ToStr_bits = String.valueOf(arr2ToStr.charAt(i));

                if (arr1ToStr_bits.equals("1") || arr2ToStr_bits.equals("1")) {
                    total += "#";
                } else {
                    total += " ";
                }

            }
            answer[j] = total;
        }

        return answer;
    }
}
