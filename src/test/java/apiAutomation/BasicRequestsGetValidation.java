package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class BasicRequestsGetValidation {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in/api/users?page=2";

        Response res = given().when().get().then().extract().response();
        System.out.println(res);
        String resAsString = res.asString();
        System.out.println(resAsString);
        int statusCode = res.statusCode();
        System.out.println(statusCode);

        JsonPath js = new JsonPath(resAsString);
        int total = js.get("total");
        if(total == 12 ){
            System.out.println("test1 is passed");
        }

        List<Object> dataList = js.getList("data");
        System.out.println(dataList);

        String emailOfFirstData = js.get("data[0].email");
        System.out.println(emailOfFirstData); // george.bluth@reqres.in
        for(int i =0; i < dataList.size(); i++) {
            int idVal = js.get("data["+i+"].id");
            System.out.println(idVal);
        }


        // verify that total is coming as 12
    }
}
