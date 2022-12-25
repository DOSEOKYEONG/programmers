package org.example.level2;

import java.util.*;

public class FriendsFourBlock {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17679
    // [1차] 프렌즈4블록

    public int solution(int m, int n, String[] board) {
        int answer = 0;
        boolean check = true;

        Character[][] array = new Character[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = board[i].charAt(j);
            }
        }

        Set<String> point = new LinkedHashSet<>();

        while (check) {
            for (int k = m - 1; k > 0; k--) { // 위치찾기
                for (int l = 0; l < n - 1; l++) {
                    Character f = array[k][l];
                    if (f != '0') {
                        if (f == array[k][l + 1]) {
                            if (f == array[k - 1][l]) {
                                if (f == array[k - 1][l + 1]) {
                                    point.add(k + "," + l);
                                    point.add(k + "," + (l + 1));
                                    point.add((k - 1) + "," + l);
                                    point.add((k - 1) + "," + (l + 1));
                                }
                            }
                        }
                    }
                }
            }

            if (point.isEmpty()) {
                break;
            } else {
                for (String str : point) {
                    answer++;
                    String[] points = str.split(",");
                    array[Integer.parseInt(points[0])][Integer.parseInt(points[1])] = '0';
                }
                point.clear();
            }

            for (int q = 0; q < n; q++) {
                ArrayList<Character> characters = new ArrayList<>();
                for (int w = m - 1; w >= 0; w--) {
                    if (array[w][q] != '0') {
                        characters.add(array[w][q]);
                    }
                }
                for (int e = m - 1; e >= 0; e--) {
                    if (characters.size() > 0) {
                        array[e][q] = characters.get(0);
                        characters.remove(0);
                    } else {
                        array[e][q] = '0';
                    }
                }
            }
        }

        return answer;
    }
}
