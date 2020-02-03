import Solutions.Easy.ReverseInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTest { // no need to specify privacy -- merely testing
    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    void testReverse() {
        assertEquals(123, reverseInteger.reverse(1));
    }
}
