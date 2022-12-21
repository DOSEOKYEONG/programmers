package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        stockPrice.solution(new int[]{1, 2, 3, 2, 3});
    }
}