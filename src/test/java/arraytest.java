import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.*;


public class arraytest {
    @Test
    void qwe() {
        int[] numbers = new int[]{3, 30, 34, 5, 9};
        ArrayList<String> arrayList = new ArrayList<>();

        for (int a : numbers) {
            arrayList.add(String.valueOf(a));
        }

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Long num1 = convertNum(o1, o2);
                Long num2 = convertNum(o2, o1);

                System.out.println(num1);
                System.out.println(num2);

                int ss = (int) (num2 - num1);
                return ss;
            }
        });

        System.out.println(arrayList.toString());
    }

    public Long convertNum(String str1, String str2){
        String rs = str1 + str2;

        return Long.parseLong(rs);
    }
}
