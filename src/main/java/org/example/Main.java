package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        OneTwoFourWorldsNumber oneTwoFourWorldsNumber = new OneTwoFourWorldsNumber();
        for (int i = 4; i <= 30; i++) {
            oneTwoFourWorldsNumber.solution(i);
        }

    }
}