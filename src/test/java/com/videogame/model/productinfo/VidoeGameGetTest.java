package com.videogame.model.productinfo;

import com.videogame.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class VidoeGameGetTest extends TestBase {

    @Test
    public void getAllVideoGameList() {
        Response response =
                given()
                        .header("Accept","application/json")
                        .when()
                        .get("");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleVideoGame() {
        Response response = given()
                .header("Accept","application/json")
                .pathParam("id", 11)
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
