package ex32;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GuessTest {
    @Test
    public void checkDigit()
    {
        assertEquals(0, GuessNumber.isDigit("f"));
        assertEquals(1, GuessNumber.isDigit("4"));
    }
}
