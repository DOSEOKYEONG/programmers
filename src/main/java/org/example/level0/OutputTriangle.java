package org.example.level0;
import java.util.*;

public class OutputTriangle {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120823
    // 직각삼각형 출력하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            String line = "";
            for(int j = 1; j <= i; j++){
                line += "*";
            }
            System.out.println(line);
        }
    }
}
