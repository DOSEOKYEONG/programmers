package org.example.level0;
import java.util.*;

public class MorseCode1 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120838
    // 모스부호(1)

    public String solution(String letter) {
        Map<String, String> map = new HashMap<>();
        map.put(".-", "a");
        map.put("-...", "b");
        map.put("-.-.", "c");
        map.put("-..", "d");
        map.put(".", "e");
        map.put("..-.", "f");
        map.put("--.", "g");
        map.put("....", "h");
        map.put("..", "i");
        map.put(".---", "j");
        map.put("-.-", "k");
        map.put(".-..", "l");
        map.put("--", "m");
        map.put("-.", "n");
        map.put("---", "o");
        map.put(".--.", "p");
        map.put("--.-", "q");
        map.put(".-.", "r");
        map.put("...", "s");
        map.put("-", "t");
        map.put("..-", "u");
        map.put("...-", "v");
        map.put(".--", "w");
        map.put("-..-", "x");
        map.put("-.--", "y");
        map.put("--..", "z");

        String answer = "";
        String[] letters = letter.split(" ");
        for(int i = 0; i < letters.length; i++){
            answer += map.get(letters[i]);
        }
        return answer;
    }
}
