package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        EnglishWordChainGame englishWordChainGame = new EnglishWordChainGame();
        englishWordChainGame.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
    }
}