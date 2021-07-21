package com.videogame.model.productinfo;

import com.videogame.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class VideoGameDeleteTest extends TestBase {


    @Test
    public void deleteVideoGame() {
        Response response = given()
                .pathParam("id", 11 )
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}