package org.example.level1;
import java.util.*;

public class ReportResult {
    // https://school.programmers.co.kr/learn/courses/30/lessons/92334
    // 신고 결과 받기

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];
        Map<String, ArrayList<String>> reporterMap = new HashMap<>();
        Map<String, Integer> reportedMap = new HashMap<>();

        for (String id : id_list) {
            reporterMap.put(id, new ArrayList<>());
            reportedMap.put(id, 0);
        }

        for (String rep : report) {
            String[] arr = rep.split(" ");
            String reporter = arr[0];
            String criminal = arr[1];
            if (!reporterMap.get(reporter).contains(criminal)) {
                reporterMap.get(reporter).add(criminal);
                reportedMap.put(criminal, reportedMap.get(criminal) + 1);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            int mail = 0;
            ArrayList<String> arrayList = reporterMap.get(id_list[i]);
            for (String str : arrayList) {
                if (reportedMap.get(str) >= k) {
                    mail++;
                }
            }
            answer[i] = mail;
        }

        return answer;
    }
}
