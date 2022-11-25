package org.example.level0;
import java.util.*;

public class UnusualAlignment {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120880
    // 특이한 정렬

    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        answer = new int[numlist.length];
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(Integer num : numlist){
            if (!map.containsKey(Math.abs(n - num))) {
                map.put(Math.abs(n - num), new ArrayList<>());
                map.get(Math.abs(n - num)).add(num);
            } else {
                map.get(Math.abs(n - num)).add(num);
            }
        }

        Object[] sortedGap = map.keySet().toArray();
        Arrays.sort(sortedGap);
        int index = 0;
        for (int i = 0; i < sortedGap.length; i++){
            // arrayList 가져와서 정렬하기
            ArrayList<Integer> gapList = map.get(sortedGap[i]);
            Collections.sort(gapList);
            for(int j = gapList.size() - 1; j >= 0; j--) {
                answer[index] = gapList.get(j);
                index++;
            }
        }

        return answer;
    }
}
