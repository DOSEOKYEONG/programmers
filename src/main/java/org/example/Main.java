package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NJinsuGame nJinsuGame = new NJinsuGame();
//        nJinsuGame.solution(2, 4, 2, 1);
        nJinsuGame.solution(16, 16, 2, 1);
    }
}