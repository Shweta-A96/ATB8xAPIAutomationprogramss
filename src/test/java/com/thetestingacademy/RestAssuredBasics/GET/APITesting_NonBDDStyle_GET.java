package com.thetestingacademy.RestAssuredBasics.GET;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_NonBDDStyle_GET {

    static RequestSpecification r = RestAssured.given();


    @Description("TC1-NonBDDStyle-Positive Testcase")
    @Test
    public void test_NonBDDStyleGET_Positive() {

        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/587101");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }

    @Description("TC2-NonBDDStyle-Negative Testcase")
    @Test
    public void test_NonBDDStyleGET_Negative() {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/-1");
        r.when().log().all().get();
        r.then().log().all().statusCode(404);
    }
}

