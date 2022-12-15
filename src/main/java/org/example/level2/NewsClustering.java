package org.example.level2;
import java.util.*;

public class NewsClustering {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17677
    // [1차] 뉴스 클러스터링

    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.length() == 0 && str2.length() ==0 ){
            return 65536;
        }

        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();

        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            String str = str1.substring(i, i + 2).toLowerCase().replaceFirst("[^a-z]", "");
            if (str.length() > 1) {
                arrayList1.add(str);
            }
        }

        for (int j = 0; j < str2.length() - 1; j++) {
            String str = str2.substring(j, j+ 2).toLowerCase().replaceFirst("[^a-z]", "");
            if (str.length() > 1) {
                arrayList2.add(str);
            }
        }

        for (String s : arrayList1) {
            if (arrayList2.remove(s)) {
                intersection.add(s);
            }
            union.add(s);
        }

        for (String s : arrayList2) {
            union.add(s);
        }

        if (intersection.size() == 0 && union.size() == 0) {
            return 65536;
        }

        double i = intersection.size();
        double u = union.size();

        double jaccard = i / u;

        answer = (int) (65536 * jaccard);

        return answer;
    }
}
