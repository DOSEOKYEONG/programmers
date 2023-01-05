package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SerialPartNumberSums serialPartNumberSums = new SerialPartNumberSums();
        serialPartNumberSums.solution(new int[]{7, 9, 1, 1, 4});
    }
}