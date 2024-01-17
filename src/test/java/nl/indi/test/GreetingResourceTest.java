package nl.indi.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.oidc.server.OidcWiremockTestResource;

@QuarkusTest
@QuarkusTestResource(OidcWiremockTestResource.class)
class GreetingResourceTest {
    @Test
    void testHelloEndpoint() {
        given() //
                .when().get("/hello") //
                .then() //
                .statusCode(200) //
                .body(is("Hello from RESTEasy Reactive"));
    }
}