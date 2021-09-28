package ex35;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WinnerTest {
    @Test
    public void checkWinner()
    {
        List<String> list = Arrays.asList("Homer", "Bart", "Lisa", "Maggie", "Moe");
        String winner = PickWinner.winner(5, list);
        assertEquals(true, list.contains(winner));
    }
}
