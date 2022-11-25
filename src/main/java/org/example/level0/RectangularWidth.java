package org.example.level0;

public class RectangularWidth {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120860
    // 직사각형 넓이 구하기

    public int solution(int[][] dots) {
        int answer = 0;
        //  a * b = width;
        // [[-1, -1], [1, 1], [1, -1], [-1, 1]]	4
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int a = 1;
        int b = 1;

        // 높이 구하기
        for(int i = 1; i < dots.length; i++){
            if(dots[i][0] == x1){
              if (dots[i][1] > y1){
                  a = dots[i][1] - y1;
              } else {
                  a = y1 -dots[i][1];
              }
            }
        }

        // 길이 구하기
        for(int j = 1; j < dots.length; j++){
            if(dots[j][1] == y1){
                if (dots[j][0] > x1){
                    b = dots[j][0] - x1;
                } else {
                    b = x1 -dots[j][0];
                }
            }
        }

        answer = a * b;

        return answer;
    }
}
