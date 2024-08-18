package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ParseJsonResponse {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";
        Response resOfSingleGet = given().when().get("/api/unknown/2").then().extract().response();
        String resofSingleGetAsString = resOfSingleGet.asString();
        int statusCode = resOfSingleGet.statusCode();
        System.out.println(statusCode);
        System.out.println(resofSingleGetAsString);

        JsonPath js = new JsonPath(resofSingleGetAsString);

        // get the name from the response

        String name = js.get("data.name");
        System.out.println(name);  // fuchsia rose

        if(name.equals("fuchsia rose")) {
            System.out.println("Test is passed");
        } else {
            System.out.println("test is failed");
        }

        String resMultipleRecords = given().when().get("/api/unknown").then().extract().response().asString();
        System.out.println(resMultipleRecords);

        JsonPath js1 = new JsonPath(resMultipleRecords);
        List<Object> dataList = js1.getList("data");
        for(int i =0 ; i< dataList.size(); i++){
            int getId = js1.get("data[" + i + "].id");
            System.out.println(getId);
            if(getId == 3){
                String getName = js1.get("data[" + i + "].name");
                if(getName.equals("true red")){
                    System.out.println("Test 2 is passed");
                } else {
                    System.out.println("Test 2 is failed");
                }
            }
        }

    }
}
