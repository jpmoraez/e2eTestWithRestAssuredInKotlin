/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package e2eTestWithRestAssuredInKotlin

import org.hamcrest.CoreMatchers.*
import org.junit.jupiter.api.Test

class AppTest {

    @Test fun testListUsers() {
        io.restassured.RestAssured.`when`()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("page", `is`(2))
    }
}
