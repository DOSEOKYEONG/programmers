package org.example.level1;
import java.util.*;

public class KthNumber {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42748
    // K번째 수
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];

        int index = 0;
        for (int[] command : commands) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = command[0] - 1; i < command[1]; i++) {
                arrayList.add(array[i]);
            }
            Collections.sort(arrayList);
            answer[index] = arrayList.get(command[2]-1);
            index++;
        }
        return answer;
    }
}
