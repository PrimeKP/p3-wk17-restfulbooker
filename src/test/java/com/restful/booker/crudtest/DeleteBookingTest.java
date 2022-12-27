package com.restful.booker.crudtest;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteBookingTest extends TestBase {
    @Test
    public void deleteBookingData(){
        Response response=given()
                .header("Cookie", "token=938296fbbc7b1e5")
                .header("Content-Type", "application/json")
                .pathParam("id", "1624")
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
