package org.example;


import org.example.level0.*;
import org.example.level1.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TouchKeypad touchKeypad = new TouchKeypad();
        touchKeypad.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
    }
}