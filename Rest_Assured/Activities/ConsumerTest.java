package liveProject;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.given;
@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
    //Headers
    Map<String, String> headers=new HashMap<>();

    //Resource Path
    String resourcePath="/api/users";

    //Create Contract
    @Pact(consumer="UserConsumer",provider="UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder)
    {
        //Add the Header
        headers.put("Content-Type","application/json");

        //Create Request and Response Body
        DslPart requestResponseBody=new PactDslJsonBody()
                .numberValue("id",1234)
                .stringType("firstName","Jaydeb")
                .stringType("lastName","Jana")
                .stringType("email","abcd@gmail.com");

        //Return the contract
        return builder.given("A request to create a user")
                .uponReceiving("A request to create a user")
                .method("POST")
                .path(resourcePath)
                .headers(headers)
                .body(requestResponseBody)
                .willRespondWith()
                .status(201)
                .body(requestResponseBody)
                .toPact();


    }

    @Test
    @PactTestFor(providerName ="UserProvider",port = "8280")
    public void postRequestTest()
    {
        //Request Body
        Map<String,Object> reqBody=new HashMap<>();

        reqBody.put("id",1234);
        reqBody.put("firstName","Jaydeb");
        reqBody.put("lastName","Jana");
        reqBody.put("email","abcd@gmail.com");

        //Send the request

        given().headers(headers).body(reqBody).baseUri("http://localhost:8280").log().all()
                .when().post(resourcePath)
                .then().statusCode(201).log().all();


    }

}
