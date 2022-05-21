package com.geekbrains.backend.test.imgur;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ImgurApiFunctionalTest extends ImgurApiAbstractTest {

    private static String CURRENT_IMAGE_ID;

    @Test
    @Order(1)
    void getAccountBase() {
        String userName = "burgalash";

        ResponseSpecification resp1 = new ResponseSpecBuilder()
                .expectBody ("data.id", is(157949785))
                .expectBody("data.avatar_name", is("default/B"))
                .build();

        given()
                .spec(requestSpecification)
                .log()
                .all()
                .expect()
                .body("data.id", is(157949785))
                .log()
                .all()
                .when()
                .get("account/" + userName);
    }

    @Test
    @Order(2)
    void postImageTest() {

        ResponseSpecification resp2 = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody ("data.id", is("yyvhyL9"))
                .expectBody("data.title", is("null"))
                .expectBody("data.size", is(46314))
                .build();

        CURRENT_IMAGE_ID = given()
                .spec(requestSpecification)
                .multiPart("image", getFileResource("img.jpg"))
                .formParam("name", "")
                .formParam("title", "null")
                .log()
                .all()
                .expect()
                .body("data.size", is(46314))
                .body("data.type", is("image/png"))
                .body("data.name", is(""))
                .body("data.title", is("null"))
                .log()
                .all()
                .when()
                .post("upload")
                .body()
                .jsonPath()
                .getString("data.id");
    }

    @Test
    @Order(3)
    void deleteImageById() {

        ResponseSpecification resp3 = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();

        given()
                .spec(requestSpecification)
                .log()
                .all()
                .expect()
                .body("status", is(200))
                .log()
                .all()
                .when()
                .delete("image/" + CURRENT_IMAGE_ID);
    }

    @Test
    void testCreateComment() {

        ResponseSpecification resp4 = new ResponseSpecBuilder()
                .build();

        given()
                .spec(requestSpecification)
                .formParam("image_id", "8xGCvWR")
                .formParam("comment", "Hello world")
                .log()
                .all()
                .expect()
                .body("success", is(true))
                .body("status", is(200))
                .log()
                .all()
                .when()
                .post("comment");
    }

//    @Test
//    void testGetImage() {
//        given()
//                .spec(requestSpecification)
//                .formParam("id", "SycLyYv")
//                .log()
//                .all()
//                .expect()
//                .body("data.type", is("image/png"))
//                .body("data.width", is(300))
//                .body("data.height", is(300))
//                .body("data.name", is("001.png"))
//                .body("success", is(true))
//                .body("status", is(200))
//                .log()
//                .all()
//                .when();
//    }
}
