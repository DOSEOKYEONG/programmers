package org.example.level0;

public class CharactersPosition {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120861
    // 캐릭터의 좌표

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        int x = 0;
        int y = 0;

        int maxL = (board[0] - 1)/ 2 * - 1;
        int maxR = (board[0] - 1)/ 2;
        int maxD = (board[1] - 1)/ 2 * - 1;
        int maxU = (board[1] - 1)/ 2;

        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left")){
                if(x - 1 >= maxL){
                    x -= 1;
                }
            } else if(keyinput[i].equals("right")){
                if(x + 1 <= maxR){
                    x += 1;
                }
            } else if(keyinput[i].equals("up")){
                if(y + 1 <= maxU){
                    y += 1;
                }
            } else{
                if(y - 1 >= maxD){
                    y -= 1;
                }
            }
        }

        answer[0] = x;
        answer[1] = y;


        return answer;
    }
}
