package activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity2 {
    String URI = "https://petstore.swagger.io/v2/user";

    @Test(priority=1)
    public void addNewUserFromFile() throws IOException {

        FileInputStream inputJSON = new FileInputStream("src/main/resources/test.json");
        String reqBody = new String(String.valueOf(inputJSON.read()));
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .body(reqBody) // Pass request body from file
                        .when().post(URI); // Send POST request

        inputJSON.close();

        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("88901"));
    }

    @Test(priority=2)
    public void getUserInfo() {
        // Import JSON file to write to
        File outputJSON = new File("src/main/resources/userGETResponse.json");

        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .pathParam("username", "justinc") // Pass request body from file
                        .when().get(URI + "/{username}"); // Send POST request


        String resBody = response.getBody().asPrettyString();

        try {

            outputJSON.createNewFile();

            FileWriter writer = new FileWriter(outputJSON.getPath());
            writer.write(resBody);
            writer.close();
        } catch (IOException excp) {
            excp.printStackTrace();
        }

        // Assertion
        response.then().body("id", equalTo(88901));
        response.then().body("username", equalTo("JJ"));
        response.then().body("firstName", equalTo("Jaydeb"));
        response.then().body("lastName", equalTo("Jana"));
        response.then().body("email", equalTo("justincase@mail.com"));
        response.then().body("password", equalTo("password123"));
        response.then().body("phone", equalTo("9812763450"));
    }

    @Test(priority=3)
    public void deleteUser() throws IOException {
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .pathParam("username", "justinc") // Add path parameter
                        .when().delete(URI + "/{username}"); // Send POST request

        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("justinc"));
    }

}
