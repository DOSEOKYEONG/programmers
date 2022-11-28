package org.example;


import org.example.level0.*;
import org.example.level1.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }
}