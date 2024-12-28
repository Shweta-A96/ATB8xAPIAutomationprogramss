package com.thetestingacademy.RestAssuredBasics.GET;

import io.restassured.RestAssured;

public class APITest001_GET {
    public static void main(String[] args) {

        //Gherkins Syntax

        //Full URL -> https://restful-booker.herokuapp.com/booking/1
        //base URI -> https://restful-booker.herokuapp.com
        //base path -> /booking/1
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1")
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}
