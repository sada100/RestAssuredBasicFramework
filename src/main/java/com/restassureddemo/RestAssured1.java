package com.restassureddemo;

import static io.restassured.RestAssured.given;
//import io.restassured.matcher.RestAssuredMatchers.*;
//import org.hamcrest.Matchers.*;

public class RestAssured1 {
	public static void main(String[] args) {

		// Endpoint:
		// https://healthsystem-int-api.qat-phynd.com/api/HealthSystem/zipcode/%%%
		// Type of Method : GET
		// Header : null
		// body : null

		given().when()
		.get("https://healthsystem-int-api.qat-phynd.com/api/HealthSystem/zipcode/23")
		.then().log().all();

	}
}
