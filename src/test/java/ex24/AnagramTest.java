package ex24;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    @Test
    public void checkAnagram()
    {
        assertEquals(1, AnagramChecker.isAnagram("note", "tone"));
        assertEquals(0, AnagramChecker.isAnagram("today", "tomorrow"));
        assertEquals(1, AnagramChecker.isAnagram("race", "care"));
    }
}
