package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BiggestNumber biggestNumber = new BiggestNumber();
//        biggestNumber.solution(new int[]{6, 10, 2});
//        biggestNumber.solution(new int[]{3, 30, 34, 5, 9});
//        biggestNumber.solution(new int[]{1, 10, 100, 1000, 818, 81, 898, 89, 0, 0});
        System.out.println(biggestNumber.solution(new int[]{0, 0, 0, 0}));
//        biggestNumber.solution(new int[]{3, 30});
    }
}