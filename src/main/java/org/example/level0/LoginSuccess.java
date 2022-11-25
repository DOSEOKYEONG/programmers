package org.example.level0;
import java.util.*;

public class LoginSuccess {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120883
    // 로그인 성공?

    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < db.length; i++){
            map.put(db[i][0], db[i][1]);
        }

        if (map.containsKey(id_pw[0])) {
            if (map.get(id_pw[0]).equals(id_pw[1])) {
                answer = "login";
            } else {
                answer = "wrong pw";
            }
        } else {
            answer = "fail";
        }

        return answer;
    }
}
