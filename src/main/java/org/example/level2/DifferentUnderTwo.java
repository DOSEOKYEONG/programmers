package org.example.level2;

public class DifferentUnderTwo {
    // https://school.programmers.co.kr/learn/courses/30/lessons/77885
    // 2개 이하로 다른 비트

    public long[] solution(long[] numbers) {
        long[] answer = {};
        answer = new long[numbers.length];

        long[] qw = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = bitCompare(numbers[i]);
            qw[i] = asd(numbers[i]);
        }

        return answer;
    }

    public long bitCompare(long num) {
        if (num % 2 == 0) {
            return num + 1;
        }
        // 10 -> 2
        String numToBi = Long.toBinaryString(num);

        // 모두 1인지 확인
        boolean same = true;
        for (int i = 0; i < numToBi.length() - 1; i++) {
            if (Character.compare(numToBi.charAt(i), numToBi.charAt(i + 1)) != 0) {
                same = false;
            }
        }

        // 모두 1이면 앞에 0 추가
        if (same) {
            numToBi = "0" + numToBi;
        }

        // 뒤에서부터 01 찾으면 바꿔주기
        char[] strArr = numToBi.toCharArray();
        for (int i = strArr.length - 1; i > 0; i--) {
            String str = String.valueOf(strArr[i - 1]) + String.valueOf(strArr[i]);
            if (str.equals("01")) {
                strArr[i - 1] = '1';
                strArr[i] = '0';
                break;
            }
        }

        String result = String.valueOf(strArr);

        return Long.parseLong(result, 2);
    }

    public long asd(long num) {
        String numToBi = Long.toBinaryString(num);

        long bigger = num;

        while (true) {
            int count = 0;
            bigger++;
            String biggerToBi = Long.toBinaryString(bigger);

            // 길이 맞춰주기
            if (numToBi.length() < biggerToBi.length()) {
                for (int i = 0; i < biggerToBi.length() - numToBi.length(); i++) {
                    numToBi = "0" + numToBi;
                }
            }

            for (int j = 0; j < numToBi.length(); j++) {
                if (numToBi.charAt(j) != biggerToBi.charAt(j)) {
                    count++;
                }
            }

            if (count == 1 || count == 2) {
                return bigger;
            }
        }
    }
}
