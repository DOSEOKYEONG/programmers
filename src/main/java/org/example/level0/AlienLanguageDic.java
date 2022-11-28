package org.example.level0;
import java.util.*;

public class AlienLanguageDic {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120869
    // 외계어 사전

    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < spell.length; i++){
            arrayList.add(spell[i]);
        }

        for(int j = 0; j < dic.length; j++){
            for (int k = 0; k < arrayList.size(); k++){
                if (dic[j].contains(arrayList.get(k))) {
                    if (k == arrayList.size() - 1){
                        answer = 1;
                    }
                } else {
                    break;
                }
            }
        }

        return answer;
    }
}
