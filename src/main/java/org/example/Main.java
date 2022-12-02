package org.example;


import org.example.level0.*;
import org.example.level1.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        WorkoutClothes workoutClothes = new WorkoutClothes();
        workoutClothes.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
//        workoutClothes.solution(4, new int[]{2, 3}, new int[]{3, 4});
//        workoutClothes.solution(3, new int[]{3}, new int[]{1});
    }
}