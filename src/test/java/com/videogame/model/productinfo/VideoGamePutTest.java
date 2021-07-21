package com.videogame.model.productinfo;

import com.videogame.model.VideoGamePojo;
import com.videogame.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class VideoGamePutTest extends TestBase {

    @Test
    public void updateVideoGameWithPut()
    {
        VideoGamePojo videoGamePojo = new VideoGamePojo();
        videoGamePojo.setId(11);
        videoGamePojo.setName("Mario 003");
        videoGamePojo.setReleaseDate("2021-07-20");
        videoGamePojo.setReviewScore(7);
        videoGamePojo.setCategory("Platform");
        videoGamePojo.setRating("Universal");

        Response response = given()
                .pathParam("id",11)
                .header("Content-Type","application/json")
                .header("Accept","application/json")
                .body(videoGamePojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
