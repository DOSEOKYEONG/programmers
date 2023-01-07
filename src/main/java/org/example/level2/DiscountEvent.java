package org.example.level2;
import java.util.*;

public class DiscountEvent {
    // https://school.programmers.co.kr/learn/courses/30/lessons/131127
    // 할인 행사
    Map<String, Integer> wantMap;


    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        this.wantMap = new HashMap<>();

        for (int i = 0; i <= discount.length - 10; i++) {
            refresh(want, number);
            if (canBuy(i, wantMap, discount)) {
                answer++;
            }
        }

        return answer;
    }

    public void refresh(String[] want, int[] number) {
        for (int k = 0; k < want.length; k++) {
            wantMap.put(want[k], number[k]);
        }
    }

    public boolean canBuy(int index, Map<String, Integer> wantList, String[] discountList) {

        for (int j = 0; j < 10; j++) {
            if (wantList.containsKey(discountList[index + j])) {
                if (wantList.get(discountList[index + j]) > 0) {
                    wantList.put(discountList[index + j], wantList.get(discountList[index + j]) - 1);
                }
            }
        }

        Set<String> ks = wantList.keySet();
        for (String key : ks) {
            if (wantList.get(key) > 0) {
                return false;
            }
        }
        return true;
    }
}
