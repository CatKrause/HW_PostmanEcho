package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostManEchoTest {
    @Test
    void shouldReturnData() {
        given()
                .

                baseUri("https://postman-echo.com")
                        .

                contentType("text/plain; charset=UTF-8")
                        .

                body("Во поле берёзка стояла")
                        .

                when()
                        .

                post("/post")
                        .

                then()
                        .

                statusCode(200)
                        .

                body("data", equalTo("Во поле берёзка стояла"))
        ;
    }
}