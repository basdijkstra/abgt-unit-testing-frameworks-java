package examples;

import org.junit.jupiter.api.Test;

/**
 * This class contains examples that illustrate how JUnit identifies test methods.
 */
public class WritingAndRunningATest {

    /**
     * Because this method is annoted with @Test,
     * JUnit identifies it as a test method.
     */
    @Test
    public void thisMethodIsIdentifiedAsATestMethod() {
    }

    /**
     * This method, too, is annotated with @Test,
     * and therefore identified by JUnit as a test method.
     */
    @Test
    public void thisMethodIsAlsoIdentifiedAsATestMethod() {
    }

    /**
     * This method does not have a @Test method, so JUnit
     * does not identify it as a test method.
     */
    public void thisMethodIsNotIdentifiedAsATestMethod(){
    }
}
