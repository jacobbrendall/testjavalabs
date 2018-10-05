package restUtils;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;


public class RestUtils {

    RequestSpecification spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .setBaseUri("http://api.flutrack.org/")
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();

    @Test
    public void useSpec() {
        JsonPath response = RestAssured
                .given().spec(spec)
                .when().get("?limit=3")
                .then().statusCode(200).extract().jsonPath();

        System.out.println(response.getList("user_name"));

    }
}
