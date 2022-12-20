package org.example.level2;

import java.util.*;

public class ParkingFee {
    // https://school.programmers.co.kr/learn/courses/30/lessons/92341
    // 주차 요금 계산

    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String, String> ParkingLot = new HashMap<>();
        Map<String, Integer> feeMap = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            String[] strArray = records[i].split(" ");
            String time = strArray[0];
            String number = strArray[1];
            String InOut = strArray[2];

            if (InOut.equals("IN")) {
                ParkingLot.put(number, time);
            } else {    // 나가는 경우
                int inHour = Integer.parseInt(ParkingLot.get(number).split(":")[0]);
                int inMinute = Integer.parseInt(ParkingLot.get(number).split(":")[1]);
                int outHour = Integer.parseInt(time.split(":")[0]);
                int outMinute = Integer.parseInt(time.split(":")[1]);

                int feeTime = ((outHour * 60) + outMinute ) - ((inHour * 60) + inMinute);
                ParkingLot.remove(number);
                if (feeMap.containsKey(number)) {
                    feeMap.put(number, feeMap.get(number) + feeTime);
                } else {
                    feeMap.put(number, feeTime);
                }
            }
        }

        if (!ParkingLot.isEmpty()) { // 주차장 비우기
            Set<String> keySet = ParkingLot.keySet();
            for (String number : keySet) {
                int inHour = Integer.parseInt(ParkingLot.get(number).split(":")[0]);
                int inMinute = Integer.parseInt(ParkingLot.get(number).split(":")[1]);
                int outHour = 23;
                int outMinute = 59;

                int feeTime = ((outHour * 60) + outMinute ) - ((inHour * 60) + inMinute);
                if (feeMap.containsKey(number)) {
                    feeMap.put(number, feeMap.get(number) + feeTime);
                } else {
                    feeMap.put(number, feeTime);
                }
            }
        }

        answer = new int[feeMap.size()];

        Set<String> ks = feeMap.keySet();

        ArrayList<String> arrayList = new ArrayList<>(ks);
        Collections.sort(arrayList);

        int index = 0;
        for (String s : arrayList) {
            int t = feeMap.get(s);
            if (t < fees[0]) { // 기본요금 만족
                answer[index] = fees[1];
            } else {
                double i = (double) (t - fees[0]) / (double) fees[2];
                answer[index] = fees[1] + ((int)Math.ceil(i) * fees[3]);
            }
            index++;
        }


        return answer;
    }
}
