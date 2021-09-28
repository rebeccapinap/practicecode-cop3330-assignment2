package ex36;

import org.junit.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ComputingTest {
    @Test
    public void checkStatistics()
    {
        List<Integer> list = Arrays.asList(100, 200, 1000, 300);
        assertEquals(400.0, ComputingStatistics.average(4, list));
        assertEquals(100, ComputingStatistics.min(4, list));
        assertEquals(1000, ComputingStatistics.max(4, list));
        assertEquals(353.5533905932738, ComputingStatistics.std(4, list));
    }
}
