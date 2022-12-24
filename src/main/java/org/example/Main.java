package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PickTangerine pickTangerine = new PickTangerine();
        pickTangerine.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
    }
}