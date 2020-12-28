/**
 * This class will provide different data to test
 */
package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderTemplate {

    //Method to provide data
    @DataProvider(name = "nameToBeUseInTest")
    public Object[][] dataToSend() {
        return new Object[][] {
                {},
                {}
        };
    }
}
