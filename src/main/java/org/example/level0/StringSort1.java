package org.example.level0;
import java.util.*;

public class StringSort1 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120850
    // 문자열 정렬하기(1)

    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> numberList = new ArrayList();
        for(int i = 0; i < my_string.length(); i++){
            if(String.valueOf(my_string.charAt(i)).equals("0")||
                    String.valueOf(my_string.charAt(i)).equals("1")||
                    String.valueOf(my_string.charAt(i)).equals("2")||
                    String.valueOf(my_string.charAt(i)).equals("3")||
                    String.valueOf(my_string.charAt(i)).equals("4")||
                    String.valueOf(my_string.charAt(i)).equals("5")||
                    String.valueOf(my_string.charAt(i)).equals("6")||
                    String.valueOf(my_string.charAt(i)).equals("7")||
                    String.valueOf(my_string.charAt(i)).equals("8")||
                    String.valueOf(my_string.charAt(i)).equals("9")){
                numberList.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }

        answer = new int[numberList.size()];
        for(int j = 0; j < numberList.size(); j++){
            answer[j] = numberList.get(j);
        }
        Arrays.sort(answer);

        return answer;
    }
}
