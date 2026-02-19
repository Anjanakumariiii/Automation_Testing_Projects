package response;

import static io.restassured.RestAssured.given;

public class getData {

	public static void main(String[] args) {

		root response = given().baseUri("https://api.datausa.io/tesseract/cubes/acs_yg_housing_median_value_1").when()
				.get().then().statusCode(200).extract().as(root.class);

		System.out.println("Dataset Name: " + response.getName());
		System.out.println("Topic: " + response.getAnnotations().getTopic());

		System.out.println("First Dimension Name: " + response.getDimensions()[0].getName());
		System.out.println("First Measure Name: " + response.getMeasures()[0].getName());

	}
}
