package org.example.level0;

public class DiscountClothesShop {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120818
    // 옷가게 할인 받기

    public int solution(int price) {
        int answer = 0;
        if(price >= 100000 && price < 300000){
            answer = price * 95 / 100;
        } else if(price >= 300000 && price < 500000){
            answer = price * 90 / 100;
        } else if(price >= 500000){
            answer = price * 80 / 100;
        } else{
            answer = price;
        }

        return answer;
    }
}
