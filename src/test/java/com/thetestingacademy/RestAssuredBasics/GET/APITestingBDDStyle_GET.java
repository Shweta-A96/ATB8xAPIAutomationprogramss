package com.thetestingacademy.RestAssuredBasics.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITestingBDDStyle_GET {

    @Test
    public void test_GET_Req_POSTIVE() {

        String pin_code = "587101";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }


    @Test
    public void test_GET_Req_Nagative() {

        String pin_code = "-1";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }
}
