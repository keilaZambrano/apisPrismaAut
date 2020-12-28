/**
 * Here put the common behavior of the test
 */
package api;
import org.testng.annotations.AfterClass;

public class BaseTest {

    public BaseTest() {

    }

    //In this method you have to reset all changes that the test has done
    @AfterClass
    protected void tearDown() {

    }
}
