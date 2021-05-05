import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test(expected = NumberFormatException.class)
    public void TestEmpty() {
        Integer.decode("");
    }

    @Test
    public void TestNegativeDecimal() {
        assertEquals(-1077, Integer.decode("-1077"));
    }

    @Test
    public void TestPositiveDecimal() {
        assertEquals(2345, Integer.decode("+2345"));
    }

    @Test
    public void TestPositiveHex() {
        assertEquals(16, Integer.decode("0x10"));
    }

    @Test
    public void TestNegativeHex() {
        assertEquals(-32, Integer.decode("-0x20"));
    }

    @Test
    public void TestPositiveHexSharp() {
        assertEquals(64, Integer.decode("#40"));
    }

    @Test
    public void TestNegativeHexSharp() {
        assertEquals(-80, Integer.decode("-#50"));
    }

    @Test
    public void TestPositiveOct() {
        assertEquals(8, Integer.decode("010"));
    }

    @Test
    public void TestNegativeOct() {
        assertEquals(-24, Integer.decode("-030"));
    }

    @Test(expected = NumberFormatException.class)
    public void TestNumberFormatException() {
        Integer.decode("-235+45");
    }

    @Test
    public void TestMinInteger() {
        assertEquals(Integer.MIN_VALUE, Integer.decode(Integer.toString(Integer.MIN_VALUE)));
    }

    @Test
    public void TestMaxInteger() {
        assertEquals(Integer.MAX_VALUE, Integer.decode(Integer.toString(Integer.MAX_VALUE)));
    }
}
