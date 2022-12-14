package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
//        printer.solution(new int[]{2, 1, 3, 2}, 2);
        printer.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
    }
}