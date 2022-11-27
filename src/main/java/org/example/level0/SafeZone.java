package org.example.level0;

public class SafeZone {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120866
    // 안전지대

    public int solution(int[][] board){
        int answer = 0;
        int bomb = 0;

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){

                // 탐색 시작
                bomb = 0;
                for(int a = i -1; a < i + 2; a++){
                    for(int b = j -1; b < j + 2; b++){
                        if (a < 0 || a >= board.length || b < 0 || b >= board[j].length){
                            continue;
                        }
                        if (board[a][b] == 1){
                            bomb++;
                        }
                    }
                }
                // 탐색 끝 결과 확인
                if (bomb == 0){
                    answer++;
                }
            }

        }
        return answer;
    }
}
