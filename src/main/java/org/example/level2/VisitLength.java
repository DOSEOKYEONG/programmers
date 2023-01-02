package org.example.level2;

import java.util.*;

public class VisitLength {
    public int solution(String dirs) {
        int answer = 0;

        int max = 5;
        int min = -5;

        int x = 0;
        int y = 0;

        Set<String> strings = new LinkedHashSet<>();

        for (int i = 0; i < dirs.length(); i++) {
            String direction = String.valueOf(dirs.charAt(i));
            if (direction.equals("U")) {
                if (y < max) {
                    String before = "(" + x + "," + y + ")";
                    String after = "(" + x + "," + (y+1) + ")";
                    if (!strings.contains(before + "," + after) && !strings.contains(after + "," + before)) {
                        strings.add(before + "," + after);
                    }
                    y++;
                }
            } else if (direction.equals("R")) {
                if (x < max) {
                    String before = "(" + x + "," + y + ")";
                    String after = "(" + (x + 1) + "," + y + ")";
                    if (!strings.contains(before + "," + after) && !strings.contains(after + "," + before)) {
                        strings.add(before + "," + after);
                    }
                    x++;
                }
            } else if (direction.equals("D")) {
                if (y > min) {
                    String before = "(" + x + "," + y + ")";
                    String after = "(" + x + "," + (y-1) + ")";
                    if (!strings.contains(before + "," + after) && !strings.contains(after + "," + before)) {
                        strings.add(before + "," + after);
                    }
                    y--;
                }
            } else if (direction.equals("L")) {
                if (x > min) {
                    String before = "(" + x + "," + y + ")";
                    String after = "(" + (x-1) + "," + y + ")";
                    if (!strings.contains(before + "," + after) && !strings.contains(after + "," + before)) {
                        strings.add(before + "," + after);
                    }
                    x--;
                }
            }
        }

        answer = strings.size();

        return answer;
    }
}
