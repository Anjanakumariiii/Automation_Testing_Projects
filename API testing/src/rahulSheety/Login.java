package rahulSheety;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Login {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String response = given().log().all().header("Content-Type", "application/json")
				.body("{\"userEmail\":\"Nupur1@gmail.com\",\"userPassword\":\"Nupur123\"}").when()
				.post("/api/ecom/auth/login").then().log().all().extract().asString();

		System.out.println(response);
	}

	public static String getToken() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String token = given().header("Content-Type", "application/json")
				.body("{\"userEmail\":\"Nupur1@gmail.com\",\"userPassword\":\"Nupur123\"}").when()
				.post("/api/ecom/auth/login").then().extract().path("token");

		System.out.println("Token: " + token);
		return token;
	}
}
