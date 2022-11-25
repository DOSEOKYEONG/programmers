package org.example.level0;

public class ControlZ {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120853
    // 컨트롤 제트
    public int solution(String s) {
        int answer = 0;
        String[] orderList = s.split(" ");

        int z = 0;

        for(int i = 0; i < orderList.length; i++){
            if(orderList[i].trim().equals("Z")) {
                if (i == 0){

                } else {
                    // Z에 해당하는 수 찾기
                    for(int j = i - 1; j >= 0; j--){
                        if(!orderList[j].equals("Z") && !orderList[j].equals("null")){
                            z = Integer.parseInt(orderList[j]);
                            answer -= z;
                            orderList[j] = "null";
                            break;
                        }
                    }
                }

            } else {
                answer += Integer.parseInt(orderList[i]);
            }
        }

        return answer;
    }
}
