package org.example.level2;
import java.util.*;

public class Compression {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17684
    // [3차] 압축

    public int[] solution(String msg) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        for (int a = 0; a < msg.length(); a++) {
            queue.add(String.valueOf(msg.charAt(a)));
        }

        int num = 1;
        for (int i = 65; i < 91; i++) {
            char a = (char) i;
            map.put(String.valueOf(a), num);
            num++;
        }

        String str = "";
        while (!queue.isEmpty()) {
            str += queue.poll();
            if (map.containsKey(str)) {
                if (queue.peek() != null) {
                    if (!map.containsKey(str + queue.peek())) {
                        arrayList.add(map.get(str));
                        map.put(str + queue.peek(), num);
                        num++;
                        str = "";
                    }
                }else {
                    // 마지막 순서
                    if (map.containsKey(str)) {
                        arrayList.add(map.get(str));
                        str = "";
                    } else {
                        map.put(str, num);
                        num++;
                        arrayList.add(map.get(str));
                    }
                }
            }
        }

        answer = new int[arrayList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
