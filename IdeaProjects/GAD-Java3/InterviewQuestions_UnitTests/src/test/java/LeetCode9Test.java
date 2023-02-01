import org.example.Leetcode9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode9Test {
    Leetcode9 lt9 = new Leetcode9();

    @Test
    void checkIfANegativeNumberIsNotPalindrome() {
        assertEquals(false, lt9.isPalindrome(-121));
    }
}
