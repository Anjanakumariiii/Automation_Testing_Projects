package firstRequest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class BookerBookings {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		String response = given().log().all().header("Content-Type", "application/json")
				.body("{\"username\" : \"admin\",\"password\":\"password123\"}").when().get("/booking").then().log()
				.all().extract().response().asString();
		System.out.println(response);

	}

}
