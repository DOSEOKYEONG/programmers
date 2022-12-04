package org.example.level1;

public class NewIdRecommend {
    // https://school.programmers.co.kr/learn/courses/30/lessons/72410
    // 신규 아이디 추천

    public String solution(String new_id) {
        String answer = "";
//        1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String step1 = new_id.toLowerCase();
//        2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        String step2 = "";
        for (int i = 0; i < step1.length(); i++) {
            char chk = step1.charAt(i);
            if ((chk >= 'a' && chk <= 'z') || (chk >= '0' && chk <= '9') || chk == '-' || chk == '_' || chk == '.') {
                step2 += chk;
            }
        }
//        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        while (step2.contains("..")) {
            step2 = step2.replace("..", ".");
        }
//        4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        String step4 = "";
        for (int j = 0; j < step2.length(); j++) {
            if (j == 0 || j == step2.length() - 1) {
                if (step2.charAt(j) == '.') {

                } else {
                    step4 += step2.charAt(j);
                }
            } else {
                step4 += step2.charAt(j);
            }
        }
//        5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (step4.equals("")) {
            step4 = "a";
        }
//        6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//                만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        String step6 = step4;
        if (step6.length() >= 16) {
            step6 = step6.substring(0, 15);
            if (step6.charAt(step6.length() - 1) == '.') {
                step6 = step6.substring(0, step6.length() - 1);
            }
        }
//        7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        String step7 = step6;
        if (step7.length() <= 2) {
            while (step7.length() < 3) {
                step7 += step7.charAt(step7.length() - 1);
            }
        }

        answer = step7;

        return answer;
    }
}
