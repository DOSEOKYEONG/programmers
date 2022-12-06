package org.example;


import org.example.level0.*;
import org.example.level1.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MakeBurger makeBurger = new MakeBurger();
//        makeBurger.solution(new int[]{1, 2, 1, 2, 3, 1, 3, 1, 1, 2, 3, 1});
        makeBurger.solution(new int[]{1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1});

    }
}