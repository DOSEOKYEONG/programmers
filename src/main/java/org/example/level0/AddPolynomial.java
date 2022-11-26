package org.example.level0;

public class AddPolynomial {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120863
    // 다항식 더하기

    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int constant = 0;
        String[] polyArray = polynomial.split("\\+");
        for (String poly : polyArray) {
            if (poly.trim().contains("x")) { // x 항
                String[] xArray = poly.trim().split("x");
                if (xArray.length == 0) {
                    x += 1;
                } else {
                    x += Integer.parseInt(xArray[0].trim());
                }
            } else { // 상수
                constant += Integer.parseInt(poly.trim());
            }
        }

        if (x > 0 && constant > 0){ // x항 상수 둘 다 존재
            // x 항이 1일 경우 생략
            if (x == 1) {
                answer = "x" + " + " + constant;
            } else {
                answer = x + "x" + " + " + constant;
            }
        } else if (x == 0 && constant > 0) { // x 항 없는 경우, 상수만 존재
            answer = "" + constant;
        } else if (x > 0 && constant == 0){ // x항만 존재
            if (x == 1) {
                answer = "x";
            } else {
                answer = x + "x";
            }
        } else { // 둘 다 0
            answer = "0";
        }

        return answer;
    }
}
