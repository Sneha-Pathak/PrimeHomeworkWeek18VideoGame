package com.videogame.model.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;


public class TestBase {

    @BeforeClass
    // this will build the URL
    public static void init()
    {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/app/videogames";
    }

}
