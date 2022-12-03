package org.example;


import org.example.level0.*;
import org.example.level1.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NotCompletion notCompletion = new NotCompletion();
//        notCompletion.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        notCompletion.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
    }
}