package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TriAngleSnail triAngleSnail = new TriAngleSnail();
        System.out.println(triAngleSnail.solution(4));
        System.out.println(triAngleSnail.solution(5));
        System.out.println(triAngleSnail.solution(6));
    }
}