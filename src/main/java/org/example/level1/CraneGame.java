package org.example.level1;
import java.util.*;
public class CraneGame {
    // https://school.programmers.co.kr/learn/courses/30/lessons/64061
    // 크레인 인형뽑기 게임

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (Integer move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    arrayList.add(board[i][move - 1]);
                    board[i][move - 1] = 0;
                    break;
                }
            }
            if (arrayList.size() > 1) {
                if (arrayList.get(arrayList.size() - 1) == arrayList.get(arrayList.size() - 2)){
                    arrayList.remove(arrayList.size() - 1);
                    answer++;
                    arrayList.remove(arrayList.size() - 1);
                    answer++;
                }
            }
        }

        return answer;
    }
}
