package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PassingBridgeTruck passingBridgeTruck = new PassingBridgeTruck();
        passingBridgeTruck.solution(2, 10, new int[]{7, 4, 5, 6});
        passingBridgeTruck.solution(100, 100, new int[]{10});
        passingBridgeTruck.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10});
    }
}