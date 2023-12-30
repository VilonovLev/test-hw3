package seminars.third.hw;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class HWTest {
    MainHW mainHW;
    @BeforeEach
    void setUP() {
        mainHW = new MainHW();
    }

    @Test
    void oddNumber() {
        assertTrue(mainHW.evenOddNumber(2));
    }

    @Test
    void NotOddNumber() {
        assertFalse(mainHW.evenOddNumber(3));
    }

    @ParameterizedTest
    @ValueSource(ints = {2,25,100,120})
    void  numberNotInterval(int n) {
        assertFalse(mainHW.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {26,50,90,99})
    void  numberInInterval(int n) {
        assertTrue(mainHW.numberInInterval(n));
    }
}
