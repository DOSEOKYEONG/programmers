package org.example.level0;

public class game369 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120891
    // 369게임

    public int solution(int order) {
        int answer = 0;
        String numToString = String.valueOf(order);
        for(int i = 0; i < numToString.length(); i++){
            int toNum = Integer.parseInt(String.valueOf(numToString.charAt(i)));
            if(toNum == 3 || toNum == 6 || toNum == 9){
                answer++;
            }
        }
        return answer;
    }
}
