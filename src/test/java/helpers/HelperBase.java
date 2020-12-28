/**
 * Here put the common behavior of the helpers
 */
package helpers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class HelperBase {
    //The base url of the site
    protected static final String BASEURL = ConfigHeader.getBaseUrl();
    protected static final String   URLERESUMEN = ConfigHeader.getUrl();
    // If your site have credentials, you should set it here
    protected static final String KEY = ConfigHeader.getKey();
    protected static final String TOKEN = ConfigHeader.getToken();
    protected static final String USERNAME = ConfigHeader.getUsername();

    protected static final String ACCOUNTNUMBER = ConfigHeader.getAccounNumber();
    protected static final String CLOSEDATESINCE = ConfigHeader.getCloseDateSince();
    protected static final String CLOSEDATEUNTIL = ConfigHeader.getCloseDateUntil();
    protected static final String PLATFORM = ConfigHeader.getPlatform();
    protected static final String BANKCODE = ConfigHeader.getBankcode();
    protected static final String AUTHORIZATION = ConfigHeader.getAuthorization();



    //Define the content-type for the requests, for default its setting in JSON type
    protected static String contentType = ContentType.JSON.toString();

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
        return new RequestSpecBuilder().
                setBaseUri(URLERESUMEN).
                addHeader("Content-Type", contentType).
                addHeader("authorization", AUTHORIZATION).
                addQueryParam("account_number", ACCOUNTNUMBER).
                addQueryParam("close_date_since", CLOSEDATESINCE).
                addQueryParam("close_date_until", CLOSEDATEUNTIL).
                addQueryParam("platform", PLATFORM).
                addQueryParam("bank_code", BANKCODE).

                build();
    }
}
