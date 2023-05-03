package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity1 {
    String URI = "https://petstore.swagger.io/v2/pet";

    @Test
    public void addPet()
    {

        String reqBody = "{"
                + "\"id\": 88444,"
                + "\"name\": \"Riley\","
                + " \"status\": \"alive\""
                + "}";


        Response res =
                given().contentType(ContentType.JSON) // Set headers
                        .body(reqBody)
                        .when().post(URI);

        res.then().body("id", equalTo(88444));
        res.then().body("name", equalTo("Riley"));
        res.then().body("status", equalTo("alive"));

    }
    @Test(dependsOnMethods={"addPet"})
    public  void getPetInfo()
    {
        Response res =
                given().contentType(ContentType.JSON)
                        .when().pathParam("petId", "88444")
                        .get(URI + "/{petId}");


        res.then().body("id", equalTo(88444));
        res.then().body("name", equalTo("Riley"));
        res.then().body("status", equalTo("alive"));
    }


    @Test(dependsOnMethods={"getPetInfo"})
    public void deletePet() {
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .when().pathParam("petId", "88444")
                        .delete(URI + "/{petId}"); // Send DELETE request

        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("88444"));
    }



    }




