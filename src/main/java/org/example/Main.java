package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Two_X_N_Tiling twoXNTiling = new Two_X_N_Tiling();
        System.out.println(twoXNTiling.solution(2));
    }
}