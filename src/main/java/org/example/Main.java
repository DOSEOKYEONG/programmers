package org.example;


import org.example.level0.*;
import org.example.level1.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        FailureRate failureRate = new FailureRate();
        failureRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }
}