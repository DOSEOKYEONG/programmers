package org.example;


import org.example.level0.*;
import org.example.level1.*;
import org.example.level2.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        FriendsFourBlock friendsFourBlock = new FriendsFourBlock();
//        friendsFourBlock.solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"});
        friendsFourBlock.solution(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"});
    }
}