import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class arraytest {
    @Test
    void ArrayTest() {
        ArrayList<Integer> asd = new ArrayList<>();
        asd.add(1);
        asd.add(2);
        asd.add(3);
        asd.add(4);

        asd.remove(2);

        System.out.println(asd.get(2));
    }
}
