package org.example.level0;

public class TriangleCompletion2 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120868
    // 삼격형의 완성조건(2)
    public int solution(int[] sides) {
        int answer = 0;
        if(sides[0] < sides[1]){
            //가장 긴 변이 6인 경우
            for(int j = sides[1] - sides[0] + 1; j <= sides[1]; j++)
                answer++;
            //나머지 한 변이 가장 긴 변인 경우
            for(int i = sides[1] + 1; i < sides[0] + sides[1]; i++){
                answer++;
            }
        } else {
            //가장 긴 변이 6인 경우
            for(int j = sides[0] - sides[1] + 1; j <= sides[0]; j++)
                answer++;
            //나머지 한 변이 가장 긴 변인 경우
            for(int i = sides[0] + 1; i < sides[1] + sides[0]; i++){
                answer++;
            }
        }

        return answer;
}
}
