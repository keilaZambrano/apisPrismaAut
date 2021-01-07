/**
 * Here put the common behavior of the helpers
 */
package helpers;

import Model.AccessTokenModel;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class HelperBase {
    //The base url of the site
    protected static final String BASEURL = ConfigHeader.getBaseUrl();
    protected static final String URLERESUMEN = ConfigHeader.getUrl();
    // If your site have credentials, you should set it here
    protected static final String KEY = ConfigHeader.getKey();
    protected static final String TOKEN = ConfigHeader.getToken();
    protected static final String USERNAME = ConfigHeader.getUsername();

    protected static final String ACCOUNTNUMBER = ConfigHeader.getAccounNumber();
    protected static final String CLOSEDATESINCE = ConfigHeader.getCloseDateSince();
    protected static final String CLOSEDATEUNTIL = ConfigHeader.getCloseDateUntil();
    protected static final String PLATFORM = ConfigHeader.getPlatform();
    protected static final String BANKCODE = ConfigHeader.getBankcode();


    //Define the content-type for the requests, for default its setting in JSON type
    protected static String contentType = ContentType.JSON.toString();


    // get header for access token api
    public static RequestSpecification getParamsAccesToken() {
        return new RequestSpecBuilder().
                setBaseUri("https://api-dev.prismamediosdepago.com/v1/oauth/accesstoken").
                addHeader("Content-Type", contentType).
                addHeader("Authorization", "Basic ZVBjdHFHUVJ3SzZzOVJJUFdTR0xRdzU3WkNISWdSTVA6UUdzR01XeDJNb2k1RUQ3dA==").
                addQueryParam("grant_type", "client_credentials").

                build();
    }

    //get Token
    public static String getToken() {

        Response response = given(getParamsAccesToken()).
                get().
                then().
                extract().response();
        AccessTokenModel accessTokenModel = response.as(AccessTokenModel.class);
        return accessTokenModel.getAccessToken();

    }

    //Get the header for all request
    public static RequestSpecification getHeader() {
        return new RequestSpecBuilder().
                setBaseUri(BASEURL).
                addHeader("Content-Type", contentType).
                addQueryParam("key", KEY).
                addQueryParam("token", TOKEN).
                build();
    }


    public static RequestSpecification getParamsEresumen() {
        String token = getToken();
        return new RequestSpecBuilder().
                setBaseUri(URLERESUMEN).
                addHeader("Content-Type", contentType).
                addHeader("authorization", "Bearer " + token).
                addQueryParam("account_number", ACCOUNTNUMBER).
                addQueryParam("close_date_since", CLOSEDATESINCE).
                addQueryParam("close_date_until", CLOSEDATEUNTIL).
                addQueryParam("platform", PLATFORM).
                addQueryParam("bank_code", BANKCODE).

                build();
    }


}
