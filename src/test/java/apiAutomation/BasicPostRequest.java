package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BasicPostRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in";
        String inputBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        // /api/users   --> additional details/ resources

        Response res = given().body(inputBody).when().post("/api/users").then().extract().response();
        int status = res.statusCode();
        String resAsString = res.asString();
        System.out.println(status); //201
        System.out.println(resAsString); //{"id":"204","createdAt":"2024-08-03T07:28:35.735Z"}
    }
}
