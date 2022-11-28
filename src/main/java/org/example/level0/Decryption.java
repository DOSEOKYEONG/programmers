package org.example.level0;

public class Decryption {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120892
    // 암호 해독

    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = 1; i <= cipher.length(); i++){
            if(i % code == 0){
                answer += String.valueOf(cipher.charAt(i-1));
            }
        }
        return answer;
    }
}
