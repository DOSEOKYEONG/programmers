package org.example.level1;
import java.util.*;

public class RectangleStar {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12969
    // 직사각형 별찍기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str;

        for (int i = 0; i < b; i++) {
            str = "";
            for (int j = 0; j < a; j++) {
                str += "*";
            }
            System.out.println(str);
        }

//        System.out.println(a + b);
    }
}
