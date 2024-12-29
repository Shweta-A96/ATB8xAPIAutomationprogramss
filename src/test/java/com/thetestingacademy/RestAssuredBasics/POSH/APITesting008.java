package com.thetestingacademy.RestAssuredBasics.POSH;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting008 {


    // https://restful-booker.herokuapp.com/auth

    //  Content-Type: application/json

    //  {
    //    "username" : "admin",
    //    "password" : "password123"
    //}

    @Description("verify the POST request - BDD Style")
    @Test
    public void test_post_BDDStyle(){

String Payload = "{\n" +
        "    \"username\" : \"admin\",\n" +
        "    \"password\" : \"password123\"\n" +
        "}";

        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/auth")
                    .contentType(ContentType.JSON) // if we have header then we have to use it
                    .log().all().body(Payload )
                .when()
                    .log().all()
                    .post()
                .then()
                    .log().all()
                    .statusCode(200);
    }

}
