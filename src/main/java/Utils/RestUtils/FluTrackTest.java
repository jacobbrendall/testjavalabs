/*
package restUtils;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.filter.log.RequestLoggingFilter;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class FluTrackTest {

private static RequestSpecification spec;

@BeforeClass
public static void initSpec() {	
spec = new RequestSpecBuilder()
		.setContentType(ContentType.JSON)
		.setAccept(ContentType.JSON)
		.setBaseUri("http://api.flutrack.org/")
		.addFilter(new ResponseLoggingFilter())
		.addFilter(new RequestLoggingFilter())
		.build();
}
@Test
public void useSpec() {
	JsonPath response = given()
	.spec(spec)
	.when()
	.get("?limit=3")
	.then()
	.statusCode(200)
	.extract()
	.jsonPath();
	
	System.out.println(response.getList("user_name").get(0));
}
}
*/
