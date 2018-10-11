package restUtils;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.testng.Assert;
import pojos.FluTrackPojo;

import java.util.Arrays;
import java.util.List;


//TODO create utils to de-serialize objects arrays with GSON or JACKSON
// use FluTrackPojo
//TODO create utils to de-serialize  { {}{}{} } rest body
//use another API and POJO
//TODO create utils to de-serialize hybrid { {[]}  {} } REST body
//use another API and POJO

public class RestUtils {

    RequestSpecification spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                //.setBaseUri("https://api.sunrise-sunset.org/json")
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();

//90.772104
    @Test
    public void useSpec() {
        RestAssured
                .given().spec(spec)
                .when().get("http://api.flutrack.org/?limit=3")
                .thenReturn().body().prettyPrint();

    }

// object mapping test for REST response of Array types
    // maps JSON arrays including multi objects into a Array
    // and converts array to a list Object containing POJO attributes
    // expected attribute is called thru calling a regular List Item

@Test
public void executeRest() {
    String uri = "http://api.flutrack.org/?limit=3";
    List<FluTrackPojo> objListfluTrackPojo = Arrays.asList(RestAssured
            .given()
            .when().get(uri)
            .then().extract().response().body().as(FluTrackPojo[].class));

    String retrievedUserName = objListfluTrackPojo.get(0).getUser_name();

    Assert.assertEquals(retrievedUserName, "kristine_irene_");
}




/*-------------------*/
public static String serializeObjectWithGson(Object obj) {
        return new Gson().toJson(obj);

}

public static <T> T deserializeResponseWithGson(Response response, TypeToken typeToken) {
        return new Gson().fromJson(response.asString(), typeToken.getType());
}

}
