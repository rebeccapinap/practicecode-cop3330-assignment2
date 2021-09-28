package ex25;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {
    @Test
    public void checkPassword()
    {
        assertEquals(1, PasswordStrength.passwordValidator("12345"));
        assertEquals(2, PasswordStrength.passwordValidator("abcdef"));
        assertEquals(3, PasswordStrength.passwordValidator("abc123xyz"));
        assertEquals(4, PasswordStrength.passwordValidator("1337h@xor!"));
    }
}
