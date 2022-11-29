package org.example.level1;

public class MockTest {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42840
    // 모의고사

    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = new int[]{1,2,3,4,5};
        int[] person2 = new int[]{2,1,2,3,2,4,2,5};
        int[] person3 = new int[]{3,3,1,1,2,2,4,4,5,5};

        int person1Score = 0;
        int person2Score = 0;
        int person3Score = 0;


        for (int i = 0; i < answers.length; i++) {
            if (person1[i % person1.length] == answers[i]) {
                person1Score++;
            }
            if (person2[i % person2.length] == answers[i]) {
                person2Score++;
            }
            if (person3[i % person3.length] == answers[i]) {
                person3Score++;
            }
        }

        int max = Math.max(person1Score, Math.max(person2Score, person3Score));

        String numOfMax = "";

        if (person1Score == max) {
            numOfMax+= "1";
        }
        if (person2Score == max) {
            numOfMax+= "2";
        }
        if (person3Score == max) {
            numOfMax+= "3";
        }
        answer = new int[numOfMax.length()];

        for (int j = 0; j < numOfMax.length(); j++) {
            answer[j] = Integer.parseInt(String.valueOf(numOfMax.charAt(j)));
        }
        return answer;
    }
}
