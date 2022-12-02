package org.example.level1;

import java.util.ArrayList;

public class LottoMaximumAndMinimum {
    // https://school.programmers.co.kr/learn/courses/30/lessons/77484#fn1
    // 로또의 최고 순위와 최저 순위

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];

        int collect = 0;
        int numOfZero = 0;


//        1	6개 번호가 모두 일치
//        2	5개 번호가 일치
//        3	4개 번호가 일치
//        4	3개 번호가 일치
//        5	2개 번호가 일치
//        6(낙첨)	그 외

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer num : win_nums) {
            arrayList.add(num);
        }

        for (Integer lottoNum : lottos) {
            if (lottoNum == 0) {
                numOfZero++;
            } else {
                if (arrayList.contains(lottoNum)) {
                    collect++;
                }
            }
        }

        answer[0] = collect + numOfZero;
        answer[1] = collect;

        for (int i = 0; i < 2; i++) {
            if (answer[i] == 6){
                answer[i] = 1;
            } else if (answer[i] == 5){
                answer[i] = 2;
            } else if (answer[i] == 4){
                answer[i] = 3;
            } else if (answer[i] == 3){
                answer[i] = 4;
            } else if (answer[i] == 2){
                answer[i] = 5;
            } else {
                answer[i] = 6;
            }
        }

        return answer;
    }
}
