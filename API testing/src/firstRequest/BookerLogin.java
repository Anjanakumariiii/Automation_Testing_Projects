package firstRequest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class BookerLogin {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		String response = given().log().all().header("Content-Type", "application/json")
				.body("{\"username\" : \"admin\",\"password\":\"password123\"}").when().post("/auth").then().log().all()
				.extract().response().asString();
		System.out.println(response);

	}

	public static String getToken() {

		RestAssured.baseURI = "https://restful-booker.herokuapp.com";

		return given().header("Content-Type", "application/json")
				.body("{\"username\":\"admin\",\"password\":\"password123\"}").when().post("/auth").then().extract()
				.path("token");
	}
}
