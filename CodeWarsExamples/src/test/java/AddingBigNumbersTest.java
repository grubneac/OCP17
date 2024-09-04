import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddingBigNumbersTest {
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource(textBlock= """
        1   , 1  ,    2
        123 , 456,    579
        888 , 222,    1110
        1372, 69 ,    1441
        12  , 456,    468
        100 , 101,    201
        63829983432984289347293874, 90938498237058927340892374089, 91002328220491911630239667963
        05994145349896060117489621, 96570792, 5994145349896060214060413
    """)
    @DisplayName("Sample tests")
    void basicTests(String a, String b, String expected) {
        assertEquals(expected, AddingBigNumbers.add(a, b));
    }
}