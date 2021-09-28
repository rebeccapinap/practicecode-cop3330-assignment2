package ex29;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HandlingTest {
    @Test
    public void checkHandlingDigit()
    {
        assertEquals(0, HandlingInput.isDigit("f"));
        assertEquals(1, HandlingInput.isDigit("4"));
    }
}
