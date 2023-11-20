package seminar3.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
    MainHW mainHW;

    @BeforeEach
    void setup(){
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 30, 88, 160})
        void numberIsEven(int n){
        assertTrue(mainHW.evenOddNumber(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {3, 15, 33, 161})
    void numberIsOdd(int n){
        assertFalse(mainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 34, 55, 99})
    void numberIsInInterval(int n){
        assertTrue(mainHW.numberInInterval(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {25, 0, -12, 100})
    void numberIsNotInInterval(int n){
        assertFalse(mainHW.numberInInterval(n));
    }

}
