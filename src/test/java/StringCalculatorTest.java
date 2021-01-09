import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new StringCalculator();
    }

    @Test
    public void emptyStringShouldReturn0(){
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void oneNumberShouldReturnNumber(){
        int n = 2;
        assertEquals(n, calculator.add(String.valueOf(n)));
    }

    @Test
    public void twoNumbersShouldReturnSum(){
        String numbers = "2,3";
        assertEquals(5, calculator.add(numbers));
    }

    @Test
    public void moreThanTwoNumbersAllowed(){
        String numbers = "1,2,3";
        assertEquals(6, calculator.add(numbers));
    }

    @Test
    public void wrongNumberFormat(){
        String numbers = "1,hej,2";
        assertThrows(IllegalArgumentException.class, () -> calculator.add(numbers));
    }

    @Test
    void allowNewLineDelimiter(){
        String numbers = "1\n2,4";
        assertEquals(7, calculator.add(numbers));
    }

    @Test
    void allowDelimiterSpecification(){
        String numbersWithDelimiter = "//;\n2;3";

        assertEquals(5, calculator.add(numbersWithDelimiter));
    }


}