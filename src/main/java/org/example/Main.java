package org.example;


import org.example.level0.*;
import org.example.level1.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HallOfFame1 hallOfFame1 = new HallOfFame1();
        hallOfFame1.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
    }
}