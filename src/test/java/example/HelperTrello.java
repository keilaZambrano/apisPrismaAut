package example;

import helpers.HelperBase;
import org.apache.http.HttpStatus;
import pojos.PojoSample;
import pojos.ResponseEresumen;

import static io.restassured.RestAssured.given;

public class HelperTrello extends HelperBase {

    public static PojoSample[] getAllBoards() {
        return given(getHeader()).
                when().
                get("/members/" + USERNAME + "/boards/" + "?key=" + KEY + "&token=" + TOKEN).
                then().
                log().all().
                statusCode(HttpStatus.SC_OK).
                extract().response().as(PojoSample[].class);


    }

    public static ResponseEresumen[] getEresumen() {

        return given(getParamsEresumen()).
                get().
                then().
                log().all().
                statusCode(HttpStatus.SC_OK).
                extract().response().as(ResponseEresumen[].class);


    }


}
