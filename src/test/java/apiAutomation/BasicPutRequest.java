package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BasicPutRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in";
        String bodyInput = "{\n" +
                "    \"name\": \"Sumit\",\n" +
                "    \"job\": \"Software Engineer\"\n" +
                "}";
        Response res = given().body(bodyInput).when().put("/api/users/2").then().extract().response();
        int statusCode = res.statusCode();
        String resAsString = res.asString();
        System.out.println(statusCode);
        System.out.println(resAsString);
    }
}
