package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        EatGround eatGround = new EatGround();
        eatGround.solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}});
    }
}