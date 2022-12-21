import org.junit.jupiter.api.Test;

import java.util.*;


public class arraytest {
    @Test
    void qwe() {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }

        for (Integer i : queue) {
            System.out.println(i);
        }
    }
}
