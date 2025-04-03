package com.restassureddemo;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Request_Specification_Model_Respose_Specification_Model extends HealthPlanServiceArea_DTO {
	
	/*
	 * When we have multiple endpoint with same URL. only just didfference is
	 * there Http Method is Same like Put , Patch & Get
	 * so in the that case all needs same ContentType, & Authorization
	 * 
	 * so whenever we hit the time this same information we need , 
	 * which is same for all Endpoint. so this common for all request body.
	 * so we need use same action with all endpoint with this method
	 * 
	 * Request body & Request object those are common for all method so in this case
	 * we create , & bind this common things into same object
	 */
	
	public static void main(String[] args) {
		HealthPlanServiceArea_DTO HealthPlanServiceAreaObj= new HealthPlanServiceArea_DTO();
		HealthPlanServiceAreaObj.setCounty("Test");
		HealthPlanServiceAreaObj.setHealthPlanId(20222);
		HealthPlanServiceAreaObj.setHealthSystemId(106);
		HealthPlanServiceAreaObj.setZipCode("51512");
		HealthPlanServiceAreaObj.setPlanYear("2026");
		RequestSpecification reqSpec=RestAssured.given();
		reqSpec.contentType(ContentType.JSON)
		.header("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InNzYXJ3YWRzeXNhZG1xYXQxMDYiLCJIZWFsdGhTeXN0ZW1JZHMiOiIxMDYiLCJVc2VySWQiOiIzNzc2Njg3Iiwic3ViIjoic3NhcndhZHN5c2FkbXFhdDEwNiIsImp0aSI6IjBhZTRkZGUxLWY1YjItNDhiMS1hM2NhLTE0YTY1YTM1NzJiNyIsImlhdCI6MTczNjA3NjU2OSwiaXNpbnRlcm5hbHJlcXVlc3QiOiJmYWxzZSIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IlBTQSIsIm5iZiI6MTczNjA3NjU2OSwiZXhwIjoxNzM2MTA1MzY5LCJpc3MiOiJTeW1wbHJBdWRpZW5jZS1xYXQiLCJhdWQiOiJTeW1wbHJJc3N1ZXItcWF0In0.fGijKbBMTMwFuJEOE1ZjoFFEwLhCRGbCBYP47RQGF8Y")
		.baseUri("https://healthplans-int-api.qat-phynd.com")
		.basePath("/HealthPlanServiceArea");
		
		 given(reqSpec).body(HealthPlanServiceAreaObj)
		 .when().post().then().log().all();
	}
	

}
