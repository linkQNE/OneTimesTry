package SitecheckerUI.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static SitecheckerUI.api.SpecificationFactory.getDefaultRequestSpecification;


public class TestMailAppApi {

    private final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private static final String endPointTestMail = "https://api.testmail.app/api/json";
    private static final String API_KEY = "77a5b642-df30-4212-b0af-777c0586d4f6";
    private static final String API_KEY_SECOND = "2f7b7b42-c6fa-4a0b-9b8d-3f7d0deb1ba7";
    public static final String WORKSPACE_NAME = "hfjqu";
    public static final String WORKSPACE_NAME_SECOND = "z7hyr";
    private String verificationURL;

    private String getApiKey() {
        if (UsefulFeatures.getCurrentDay() % 2 == 0) {
            return API_KEY_SECOND;
        } else {
            return API_KEY;
        }
    }

    public static String getWorkspaceName() {
        if (UsefulFeatures.getCurrentDay() % 2 == 0) {
            return WORKSPACE_NAME_SECOND;
        } else {
            return WORKSPACE_NAME;
        }
    }

    private ValidatableResponse getVerificationEmail(String emailPrefix) {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("apikey", getApiKey());
        queryParams.put("namespace", getWorkspaceName());
        queryParams.put("pretty", "true");
        queryParams.put("livequery", "true");
        queryParams.put("tag_prefix", emailPrefix);

        return RestAssured
                .given().spec(getDefaultRequestSpecification())
                .queryParams(queryParams)
//                .param("timestamp_from", System.currentTimeMillis())
                .when()
                .get(endPointTestMail)
                .then()
                .log().all();
    }

    public String getVerificationURL(String emailPrefix) {
        Pattern pattern = Pattern.compile("href=\"([^\"]*)\"");

        JsonPath jsonPath = getVerificationEmail(emailPrefix).statusCode(200)
                .extract().body().jsonPath();

        String HTML = jsonPath.getString("emails.html");
        HTML = StringUtils.substringBetween(HTML, "Please verify your email to start exploring Sitechecker. </p><a", "Verify Email </a>");

        Matcher m = pattern.matcher(HTML);
        if (m.find()) {
            verificationURL = m.group(1);
        }
        System.out.println(verificationURL);
        return verificationURL;
    }
}
