import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.*;


public class arraytest {
    @Test
    void qwe() {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        Double a = 1.2345;
        Double aaa = Double.parseDouble(decimalFormat.format(a));
        System.out.println(aaa.getClass());
    }
}
