	package org.test;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
public class FibonacciTest {
	@Test
    public void testFibonacciEndpoint() {
        given()
          .when().get("/fibonacci")
          .then()
             .body("size()", equalTo(5000))
             .statusCode(200);
    }
}
