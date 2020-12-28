package example;

import api.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.PojoSample;
import pojos.ResponseEresumen;

public class ExampleTest extends BaseTest {

    public void getAllBoardsValidation(){

        Assert.assertEquals( PojoSample[].class, HelperTrello.getAllBoards().getClass(), "Fail to return all boards");
    }

    @Test
    public void getEresumen(){

       HelperTrello.getEresumen().getClass();   }

}
