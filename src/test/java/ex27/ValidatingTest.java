package ex27;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatingTest {
    @Test
    public void checkInput()
    {
        assertEquals(2, ValidatingInput.validateName("J"));
        assertEquals(0, ValidatingInput.validateName("John"));
        assertEquals(1, ValidatingInput.validateZIP("ABCDE"));
        assertEquals(0, ValidatingInput.validateZIP("12345"));
        assertEquals(1, ValidatingInput.validateEmployeeID("A12-1234"));
        assertEquals(0, ValidatingInput.validateEmployeeID("TK-4321"));
    }
}
