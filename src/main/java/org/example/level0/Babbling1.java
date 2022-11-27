package org.example.level0;
import java.util.*;

public class Babbling1 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120956
    // 옹알이(1)

    public int solution(String[] babbling) {
        int answer = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aya");
        arrayList.add("ye");
        arrayList.add("woo");
        arrayList.add("ma");

        for (int j = 0; j < babbling.length; j++) {
            for (int i = 0; i < arrayList.size(); i++){
                if (babbling[j].contains(arrayList.get(0))) {
                    babbling[j] = babbling[j].trim().replace(arrayList.get(0), " ");
                } else if (babbling[j].contains(arrayList.get(1))) {
                    babbling[j] = babbling[j].trim().replace(arrayList.get(1), " ");
                } else if (babbling[j].contains(arrayList.get(2))) {
                    babbling[j] = babbling[j].trim().replace(arrayList.get(2), " ");
                } else if (babbling[j].contains(arrayList.get(3))) {
                    babbling[j] = babbling[j].trim().replace(arrayList.get(3), " ");
                }
            }
            if (babbling[j].equals(" ")){
                answer++;
            }
        }

        return answer;
    }
}
