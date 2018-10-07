package restUtils;

import io.restassured.RestAssured;
import org.junit.Test;

// DO NOT COMMIT
class GxExpTemp {

    private String uri = "http://flutrack.org/results.json";

    @Test
    public void printJSON() {
        RestAssured
                .given().relaxedHTTPSValidation()
                .when().get(uri)
                .thenReturn().prettyPrint();

    }

}
