import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void checkCalculatorAdd() {
        assertEquals(2, calculator.add(1,1));
    }
}
