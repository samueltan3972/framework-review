package org.test;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
public class DatabaseOperationTest {
	@Test
    public void testDatabaseEndpoint() {
        given()
          .when().get("/database")
          .then()
             .body("size()", equalTo(59))
             .statusCode(200);
    }
}
