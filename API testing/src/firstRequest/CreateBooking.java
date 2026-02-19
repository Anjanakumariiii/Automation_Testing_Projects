package firstRequest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class CreateBooking {

	public static String createNewBooking() {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";

		String requestBody = "{\n" + "    \"firstname\" : \"Virat\",\n" + "    \"lastname\" : \"Kohli\",\n"
				+ "    \"totalprice\" : 1500,\n" + "    \"depositpaid\" : true,\n" + "    \"bookingdates\" : {\n"
				+ "        \"checkin\" : \"2024-04-10\",\n" + "        \"checkout\" : \"2024-04-15\"\n" + "    },\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\n" + "}";

		// Return the full POST response body
		return given().header("Content-Type", "application/json").header("Accept", "application/json").body(requestBody)
				.when().post("/booking").then().extract().asString();

	}
}
