package org.example.level0;

public class OXQuiz {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        answer = new String[quiz.length];
        int num;
        int index = 1;

        for (int i = 0; i < quiz.length; i++) {
            String[] array = quiz[i].split(" ");
            num = Integer.parseInt(array[0]);
            while (!array[index].equals("=")){
                if (array[index].trim().equals("+")){ // 덧셈
                    num += Integer.parseInt(array[index + 1]);
                    index += 2;
                } else { // 뺄셈
                    num -= Integer.parseInt(array[index + 1]);
                    index += 2;
                }
            }

            if (num == Integer.parseInt(array[index + 1])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
            index = 1;
        }
        return answer;
    }
}
