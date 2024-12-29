package com.thetestingacademy.RestAssuredBasics.POSH;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_NonBDDStyle {

    @Description("verify the POST request - NonBDD Style")
    @Test
    public void test_post_NonBDDStyle(){

        String Payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(Payload);
        r.when().post();
        r.then().log().all().statusCode(200);
    }
}
