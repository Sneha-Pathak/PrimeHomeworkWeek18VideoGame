package com.videogame.model.productinfo;

import com.videogame.model.VideoGamePojo;
import com.videogame.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class VideoGamePostTest extends TestBase {

    @Test
    public void createVideoGame()
    {
        VideoGamePojo videoGamePojo = new VideoGamePojo();
        videoGamePojo.setId(14);
        videoGamePojo.setName("Mario");
        videoGamePojo.setReleaseDate("2021-07-20");
        videoGamePojo.setReviewScore(5);
        videoGamePojo.setCategory("Platform");
        videoGamePojo.setRating("Universal");

        Response response = given()
                .header("Content-Type","application/json")
                .body(videoGamePojo)
                .when()
                .post();
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
