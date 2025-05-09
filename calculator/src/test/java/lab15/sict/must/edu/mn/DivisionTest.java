package lab15.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    void testDivideNormal() {
        Division calc = new Division();
        assertEquals(2.0, calc.divide(4.0, 2.0), 0.0001);
    }

    @Test
    void testDivideByZero() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class,
            () -> calc.divide(4.0, 0.0),
            "Тэгээр хуваах үед алдаа үүсэх ёстой");
    }
}
