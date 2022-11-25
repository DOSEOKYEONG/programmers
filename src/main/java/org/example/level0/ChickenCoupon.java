package org.example.level0;

public class ChickenCoupon {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120884
    // 치킨 쿠폰
    public int solution(int chicken) {
        int answer = 0;
        int serviceChicken;
        int leftCoupon;

        while (chicken > 9){
            answer += chicken / 10;
            serviceChicken = chicken / 10;
            leftCoupon = chicken % 10;
            chicken = leftCoupon + serviceChicken;
        }

        return answer;
    }
}
