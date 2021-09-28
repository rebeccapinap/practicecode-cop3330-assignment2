package ex28;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddingTest {
    @Test
    public void checkAdding()
    {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(15, AddingNumbers.sumCalc(array));
        int[] array2 = {2, 4, 6, 8, 10};
        assertEquals(30, AddingNumbers.sumCalc(array2));
    }
}
