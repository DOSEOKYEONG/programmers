package org.example.level0;

import java.util.*;

public class MakeRanking {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120882
    // 등수 매기기

    public int[] solution(int[][] score) {
        int[] answer = {};
        answer = new int[score.length];
        double avg;
        Map<Double, Integer> map = new HashMap<>();
        ArrayList<Double> arrayList = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            avg = (double) (score[i][0] + score[i][1]) / 2;
            if (!map.containsKey(avg)){
                map.put(avg, 1);
                arrayList.add(avg);
            } else {
                map.put(avg, map.get(avg) + 1);
            }
        }

        Collections.sort(arrayList);

        int rank = 1;
        for (int j = arrayList.size() - 1; j >= 0; j--){
            if (map.get(arrayList.get(j)) > 1){
                // 같은 점수가 있을 경우
                // 2등이 두명
                for(int k = 0; k < score.length; k++){
                    avg = (double) (score[k][0] + score[k][1]) / 2;
                    if (avg == arrayList.get(j)) {
                        answer[k] = rank;
                    }
                }
                rank += map.get(arrayList.get(j));
            } else {
                for(int k = 0; k < score.length; k++){
                    avg = (double) (score[k][0] + score[k][1]) / 2;
                    if (avg == arrayList.get(j)) {
                        answer[k] = rank;
                        rank++;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}
