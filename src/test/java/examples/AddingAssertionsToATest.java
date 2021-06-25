package examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains examples that illustrate how to use assertions in JUnit-based tests.
 */
public class AddingAssertionsToATest {

    /**
     * This test checks that 2 and 2 equals 4.
     * As that is true, the test will pass
     */
    @Test
    public void add2And2_checkIsEqualTo4() {

        int ourResult = 2 + 2;

        assertEquals(4, ourResult);
    }

    /**
     * This test checks that 2 and 2 equals 5.
     * As that is not true, the test will fail
     */
    @Test
    public void add2And2_checkIsEqualTo5() {

        int ourResult = 2 + 2;

        assertEquals(5, ourResult);
    }

    /**
     * This test, too, checks that 2 and 2 equals 5.
     * As that is not true, the test will fail again,
     * but this time with the specified message.
     */
    @Test
    public void add2And2_checkIsEqualTo5_failsWithSuppliedMessage() {

        int ourResult = 2 + 2;

        assertEquals(5, ourResult, "2 and 2 should equal 5");
    }

    /**
     * This test uses an assertTrue to check that the value of
     * a specified boolean variable is equal to 'true'.
     */
    @Test
    public void createBooleanWithValueTrue_checkUsingAssertTrue() {

        boolean ourBoolean = true;

        assertTrue(ourBoolean);
    }

    /**
     * This test uses an assertNull to check that
     * a variable has not been initialized (it has
     * never been assigned a value, or it has explicitly
     * been assigned the 'null' value).
     */
    @Test
    public void createVariableWithoutInitializing_checkUsingAssertNull() {

        String ourNullString = null;

        assertNull(ourNullString);
    }

    /**
     * This test uses an assertThrows to check that
     * a code statement throws a specific type of exception,
     * in this case a NumberFormatException. As that is the case,
     * the test will pass.
     */
    @Test
    public void tryToParseInteger_checkThrowsNumberFormatException() {

        assertThrows(NumberFormatException.class, () -> Integer.parseInt("one") );
    }

    /**
     * This test uses an assertThrows to check that
     * a code statement throws a specific type of exception,
     * in this case an ArithmeticException.
     * As that is not the case (it throws a NumberFormatException),
     * the test will fail.
     */
    @Test
    public void tryToParseInteger_checkThrowsArithmeticException() {

        assertThrows(ArithmeticException.class, () -> Integer.parseInt("one") );
    }
}
