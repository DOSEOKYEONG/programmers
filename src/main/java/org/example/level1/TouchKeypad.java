package org.example.level1;

import java.util.HashMap;
import java.util.Map;

public class TouchKeypad {
    // https://school.programmers.co.kr/learn/courses/30/lessons/67256
    // 키패드 누르기

    public String solution(int[] numbers, String hand) {
        String answer = "";

        Map<String, String> keyPadMap = new HashMap<>();
        keyPadMap.put("1", "0, 3");
        keyPadMap.put("2", "1, 3");
        keyPadMap.put("3", "2, 3");

        keyPadMap.put("4", "0, 2");
        keyPadMap.put("5", "1, 2");
        keyPadMap.put("6", "2, 2");

        keyPadMap.put("7", "0, 1");
        keyPadMap.put("8", "1, 1");
        keyPadMap.put("9", "2, 1");

        keyPadMap.put("*", "0, 0");
        keyPadMap.put("0", "1, 0");
        keyPadMap.put("#", "2, 0");

        String leftHand = "*";
        String rightHand = "#";

        for (Integer num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                leftHand = "" + num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                rightHand = "" + num;
            } else { // 2 5 8 0
                String numPos = keyPadMap.get(String.valueOf(num));
                String leftHandPos = keyPadMap.get(leftHand);
                String rightHandPos = keyPadMap.get(rightHand);

                int numToLeft = distance(numPos, leftHandPos);
                int numToRight = distance(numPos, rightHandPos);

                if (numToLeft > numToRight) {
                    // 오른손 사용
                    answer += "R";
                    rightHand = "" + num;
                } else if (numToLeft < numToRight) {
                    // 왼손 사용
                    answer += "L";
                    leftHand = "" + num;
                } else if (numToLeft == numToRight) {
                    if (hand.equals("right")) {
                        answer += "R";
                        rightHand = "" + num;
                    } else {
                        answer += "L";
                        leftHand = "" + num;
                    }
                }
            }
        }
        return answer;
    }

    public static int distance(String pos1, String pos2) {
        int x1 = Integer.parseInt(pos1.split(",")[0].trim());
        int x2 = Integer.parseInt(pos2.split(",")[0].trim());
        int y1 = Integer.parseInt(pos1.split(",")[1].trim());
        int y2 = Integer.parseInt(pos2.split(",")[1].trim());


        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }
}
