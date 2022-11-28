package org.example;


import org.example.level0.*;
import org.example.level1.AddMissingNumber;
import org.example.level1.CollatzConjecture;
import org.example.level1.ReverseAndMakeArray;
import org.example.level1.SquareRootDistinction;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        AddMissingNumber addMissingNumber = new AddMissingNumber();
        addMissingNumber.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
    }
}