package org.example.level2;
import java.util.*;

public class FileNameSort {
    public String[] solution(String[] files) {
        String[] answer = {};

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] file1 = detach(o1);
                String[] file2 = detach(o2);

                int headValue = file1[0].compareTo(file2[0]);

                if(headValue == 0) {
                    int num1 = Integer.parseInt(file1[1]);
                    int num2 = Integer.parseInt(file2[1]);

                    return num1 - num2;
                } else {
                    return headValue;
                }
            }

            private String[] detach(String str) {
                String head = "";
                String body = "";
                String tail = "";

                int index = 0;

                for( ; index < str.length() ; ++index) {
                    char ch = str.charAt(index);
                    if(ch >= '0' && ch <= '9') break;
                    head += ch;
                }

                for( ; index < str.length() ; ++index) {
                    char ch = str.charAt(index);
                    if(!(ch >= '0' && ch <= '9')) break;
                    body += ch;
                }

                for( ; index < str.length() ; ++index) {
                    char ch = str.charAt(index);
                    tail += ch;
                }

                String[] file = {head.toLowerCase(), body, tail};

                return file;
            }
        });

        return files;
    }
}
