package ex26;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PayOffTest {
    @Test
    public void checkMonths()
    {
        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(5000.0, 12 / 100.0, 100.0));
    }

}
