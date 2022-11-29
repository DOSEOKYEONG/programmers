package org.example;


import org.example.level0.*;
import org.example.level1.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringSortAsMyWill stringSortAsMyWill = new StringSortAsMyWill();
        stringSortAsMyWill.solution(new String[]{"sun", "bed", "car"}, 1);
//        stringSortAsMyWill.solution(new String[]{"abce", "abcd", "cdx"}, 2);
    }
}